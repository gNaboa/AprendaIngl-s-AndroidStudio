package com.example.aprendaingles.Fragments

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.aprendaingles.R
import kotlinx.android.synthetic.main.fragment_numeros.view.*


class NumerosFragment : Fragment() {


    private lateinit var n1:ImageView
    private lateinit var n2:ImageView
    private lateinit var n3:ImageView
    private lateinit var n4:ImageView
    private lateinit var n5:ImageView
    private lateinit var n6:ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View =  inflater.inflate(R.layout.fragment_numeros, container, false)



        n1 = view.numUm
        n2=view.numDois
        n3=view.numTres
        n4=view.numQuatro
        n5=view.numCinco
        n6=view.numSeis



        n1.setOnClickListener {

            var som = MediaPlayer.create(this.activity,R.raw.one)

            if(som!=null){
                som.start()
            }

        }
        n2.setOnClickListener {

            var som = MediaPlayer.create(this.activity,R.raw.two)

            if(som!=null){
                som.start()
            }

        }
        n2.setOnClickListener {

            var som = MediaPlayer.create(this.activity,R.raw.two)

            if(som!=null){
                som.start()
            }

        }
        n3.setOnClickListener {

            var som = MediaPlayer.create(this.activity,R.raw.three)

            if(som!=null){
                som.start()
            }

        }
        n4.setOnClickListener {

            var som = MediaPlayer.create(this.activity,R.raw.four)

            if(som!=null){
                som.start()
            }

        }
        n5.setOnClickListener {

            var som = MediaPlayer.create(this.activity,R.raw.five)

            if(som!=null){
                som.start()
            }

        }









        return view



    }


}