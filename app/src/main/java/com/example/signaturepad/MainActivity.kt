package com.example.signaturepad

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.github.gcacace.signaturepad.utils.SignaturePadBindingAdapter
import com.github.gcacace.signaturepad.views.SignaturePad

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonSalvar: Button = findViewById(R.id.button)
        var buttonLimpar: Button = findViewById(R.id.buttonLimpar)

        buttonSalvar.setOnClickListener(this)
        buttonLimpar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button){
            mostra()
        }else if(view.id == R.id.buttonLimpar){
            limpa()
        }
    }

    private fun limpa() {
        var pegaAssinatura: SignaturePad = findViewById(R.id.signatura_pad)
        pegaAssinatura.clear()
    }

    private fun mostra() {
        var pegaAssinatura: SignaturePad = findViewById(R.id.signatura_pad)
        var imageView: ImageView = findViewById(R.id.imagem)
        var bitmap: Bitmap = pegaAssinatura.signatureBitmap
        imageView.setImageBitmap(bitmap)
    }
}