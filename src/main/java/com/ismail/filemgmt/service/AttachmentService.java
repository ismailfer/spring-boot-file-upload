package com.ismail.filemgmt.service;

import com.ismail.filemgmt.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService
{
    Attachment saveAttachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId) throws Exception;
}
