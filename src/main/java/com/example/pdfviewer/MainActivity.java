package com.example.pdfviewer;

import net.sf.andpdf.pdfviewer.PdfViewerActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
Uri pdfuri;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
 }

    public void Selectfile(View view)
    {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("application/pdf");
        startActivityForResult(intent,101);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    if(requestCode == 101 && resultCode == RESULT_OK && data != null)
    {
    pdfuri =data.getData();
    }
    if(pdfuri != null)
        Toast.makeText(this, "PDF uploaded", Toast.LENGTH_SHORT).show();

    }

    public void OPEN(View view)
    {
        Intent intent = new Intent(this, pdf_viewer.class);
        startActivity(intent);
    }
}
