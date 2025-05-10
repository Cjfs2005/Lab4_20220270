package com.example.lab4_20220270.controller;

import com.example.lab4_20220270.entity.Clinic;
import com.example.lab4_20220270.repository.ClinicRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/clinica")
public class ClinicController {

    private final ClinicRepository clinicRepository;

    public ClinicController(ClinicRepository clinicRepository) {
        this.clinicRepository = clinicRepository;
    }

    @GetMapping({"", "/", "/list"})
    public String listClinics(Model model) {
        model.addAttribute("listaClinicas", clinicRepository.findAll());
        return "clinica/list";
    }

    @GetMapping("/new")
    public String newClinicForm(@ModelAttribute("clinic") Clinic clinic, Model model) {
        return "clinica/editFrm";
    }

    @GetMapping("/edit")
    public String editClinicForm(@RequestParam("id") Integer id, Model model) {
        Optional<Clinic> optionalClinic = clinicRepository.findById(id);
        if (optionalClinic.isPresent()) {
            model.addAttribute("clinic", optionalClinic.get());
            return "clinica/editFrm";
        }
        return "redirect:/clinica";
    }

    @PostMapping("/save")
    public String saveClinic(@ModelAttribute("clinic") @Valid Clinic clinic, BindingResult result,
                             RedirectAttributes attr, Model model) {
        if (result.hasErrors()) {
            return "clinica/editFrm";
        }
        clinicRepository.save(clinic);
        attr.addFlashAttribute("msg", clinic.getId() == null ? "Clínica creada exitosamente" : "Clínica actualizada exitosamente");
        return "redirect:/clinica";
    }

    @GetMapping("/delete")
    public String deleteClinic(@RequestParam("id") Integer id, RedirectAttributes attr) {
        Optional<Clinic> optionalClinic = clinicRepository.findById(id);
        if (optionalClinic.isPresent()) {
            clinicRepository.deleteById(id);
            attr.addFlashAttribute("msg", "Clínica eliminada exitosamente");
        }
        return "redirect:/clinica";
    }
}