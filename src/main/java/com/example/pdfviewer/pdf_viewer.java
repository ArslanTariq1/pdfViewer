package com.example.pdfviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class pdf_viewer extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_viewer);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("bba_sample.pdf").load();
    }
}
