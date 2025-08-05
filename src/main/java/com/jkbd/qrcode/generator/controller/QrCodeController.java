package com.jkbd.qrcode.generator.controller;

import com.jkbd.qrcode.generator.dto.QrCodeGenerateRequestDTO;
import com.jkbd.qrcode.generator.dto.QrCodeGenerateResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    public ResponseEntity<QrCodeGenerateResponseDTO> generete(@RequestBody QrCodeGenerateRequestDTO requestDTO) {

        return null;
    }

}
