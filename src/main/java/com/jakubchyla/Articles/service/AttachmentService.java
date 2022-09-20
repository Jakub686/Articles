package com.jakubchyla.Articles.service;


import com.jakubchyla.Articles.entity.Attachment;
import com.jakubchyla.Articles.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    public Attachment getById(Long id) {
        return attachmentRepository.findById(id).orElse(null);
    }

    public void deleteAttachment(Long id) {
        boolean exists = attachmentRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Attachment is not exists");
        }
        attachmentRepository.deleteById(id);
    }
}