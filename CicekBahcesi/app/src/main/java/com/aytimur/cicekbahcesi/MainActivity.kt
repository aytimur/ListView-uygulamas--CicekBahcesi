package com.aytimur.cicekbahcesi

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cicek_karti.view.*

class MainActivity : AppCompatActivity() {
    var constList=ArrayList<Cicekler>()
    var adapter:CiceklerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constList.add(Cicekler("Gül","Açıklama",R.drawable.gul))
        constList.add(Cicekler("Kasımpatı","Açıklama",R.drawable.kasimpati))
        constList.add(Cicekler("Lale","Açıklama",R.drawable.lale))
        constList.add(Cicekler("Menekşe","Açıklama",R.drawable.menekse))
        constList.add(Cicekler("Nergiz","Açıklama",R.drawable.nergiz))
        constList.add(Cicekler("Orkide","Açıklama",R.drawable.orkide))
        constList.add(Cicekler("Ortanca","Açıklama",R.drawable.ortanca))
        constList.add(Cicekler("Papatya","Açıklama",R.drawable.papatya))

        adapter= CiceklerAdapter(this,constList)
        listView.adapter=adapter
    }
    class CiceklerAdapter: BaseAdapter {
        var constList=ArrayList<Cicekler>()
        var context:Context?=null

        constructor(context: Context, constList:ArrayList<Cicekler>):super(){
            this.constList=constList
            this.context=context
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var posCicekler=constList[position]
            var inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var cicekKarti=inflator.inflate(R.layout.cicek_karti,null)
            cicekKarti.kartAdi.text = posCicekler.constAdi
            cicekKarti.kartAciklama.text = posCicekler.constAciklama
            cicekKarti.kartResim.setImageResource(posCicekler.constResim!!)

            cicekKarti.kartResim.setOnClickListener {
                var intent = Intent(context,Cicekler_detay::class.java)
                intent.putExtra("constAdi",posCicekler.constAdi)
                intent.putExtra("constAciklama",posCicekler.constAciklama)
                intent.putExtra("constResim",posCicekler.constResim!!)
                context!!.startActivity(intent)
            }
            return cicekKarti

        }

        override fun getItem(position: Int): Any {
            return constList[position]
        }

        override fun getItemId(position: Int): Long {
           return position.toLong()
        }

        override fun getCount(): Int {
            return constList.size
        }

    }
}
