package com.jakubchyla.Articles.repository;

import com.jakubchyla.Articles.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
