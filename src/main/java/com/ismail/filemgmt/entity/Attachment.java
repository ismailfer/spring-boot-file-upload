package com.ismail.filemgmt.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Data
@NoArgsConstructor
public class Attachment
{
    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
    private String id;

    private String fileName;

    private String fileType;

    /**
     * file will be saved as a blob in DB
     * other methods of storing:
     * - stored in a directory; and store the path in DB
     * - stored in a cloud filesystem; and store the path in DB
     */
    @Lob
    private byte[] data;

    public Attachment(String fileName, String fileType, byte[] data)
    {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }
}
