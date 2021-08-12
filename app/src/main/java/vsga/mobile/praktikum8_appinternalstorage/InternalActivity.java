package vsga.mobile.praktikum8_appinternalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class InternalActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonBuatFile, buttonBacaFile, buttonUbahFile, buttonHapusFile;
    TextView textBaca;
    public static final String FILENAME = "filecoba.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);

        buttonBuatFile = (Button) findViewById(R.id.buttonBuatFile);
        buttonBacaFile = (Button) findViewById(R.id.buttonBacaFile);
        buttonUbahFile = (Button) findViewById(R.id.buttonUbahFile);
        buttonHapusFile = (Button) findViewById(R.id.buttonHapusFile);
        textBaca = (TextView) findViewById(R.id.textBaca);

        buttonBuatFile.setOnClickListener(this);
        buttonBacaFile.setOnClickListener(this);
        buttonUbahFile.setOnClickListener(this);
        buttonHapusFile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonBuatFile : buatFile(); break;
            case R.id.buttonBacaFile : bacaFile(); break;
            case R.id.buttonUbahFile : ubahFile(); break;
            case R.id.buttonHapusFile : hapusFile(); break;
        }
    }

    public void buatFile(){
        String isiFile = "Coba isi data file text";
        File file = new File(getFilesDir(), FILENAME);

        FileOutputStream outputStream = null;
        try{
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception ex){
            ex.printStackTrace();
            Toast.makeText(this, "Gagal Membuat File", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(getApplication(), "Berhasil Membuat File", Toast.LENGTH_SHORT).show();
    }

    public void bacaFile(){

    }

    public void hapusFile(){

    }

    public void ubahFile(){

    }
}