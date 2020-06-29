package com.example.aprendaingles.Fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.aprendaingles.R
import kotlinx.android.synthetic.main.fragment_bichos.view.*


class BichosFragment : Fragment() {


    private lateinit var imageCao:ImageView
    private lateinit var imageGato:ImageView
    private lateinit var imageMacaco:ImageView
    private lateinit var imageLeao:ImageView
    private lateinit var imageOvelha:ImageView
    private lateinit var imageVaca:ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_bichos, container, false)



        imageCao = view.imageCao
        imageGato=view.imageGato
        imageMacaco=view.imageMacaco
        imageLeao=view.imageLeao
        imageOvelha=view.imageOvelha
        imageVaca=view.imageVaca

        imageCao.setOnClickListener {

            var som = MediaPlayer.create(this.context,R.raw.dog)

            if (som!=null){

                som.start()
            }

        }

        imageGato.setOnClickListener {

            var som = MediaPlayer.create(this.context,R.raw.cat)

            if (som!=null){

                som.start()
            }

        }

        imageMacaco.setOnClickListener {

            var som = MediaPlayer.create(this.context,R.raw.monkey)

            if (som!=null){

                som.start()
            }

        }

        imageLeao.setOnClickListener {

            var som = MediaPlayer.create(this.context,R.raw.lion)

            if (som!=null){

                som.start()
            }

        }

        imageOvelha.setOnClickListener {

            var som = MediaPlayer.create(this.context,R.raw.sheep)

            if (som!=null){

                som.start()
            }

        }

        imageVaca.setOnClickListener {

            var som = MediaPlayer.create(this.context,R.raw.cow)

            if (som!=null){

                som.start()
            }

        }

        return view
    }





}