package com.example.ahmed.dlilelmoslim

import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_afterpray.*


class afterpray : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_afterpray)

        txt.text = "أَسْـتَغْفِرُ الله، أَسْـتَغْفِرُ الله، أَسْـتَغْفِرُ الله.\n" +
                "اللّهُـمَّ أَنْـتَ السَّلامُ ، وَمِـنْكَ السَّلام ، تَبارَكْتَ يا ذا الجَـلالِ وَالإِكْـرام ."
        txt1.text = "لا إلهَ إلاّ اللّهُ وحدَهُ لا شريكَ لهُ، لهُ المُـلْكُ ولهُ الحَمْد، وهوَ على كلّ شَيءٍ قَدير، اللّهُـمَّ لا مانِعَ لِما أَعْطَـيْت، وَلا مُعْطِـيَ لِما مَنَـعْت، وَلا يَنْفَـعُ ذا الجَـدِّ مِنْـكَ الجَـد."
        txt2.text = "لا إلهَ إلاّ اللّه, وحدَهُ لا شريكَ لهُ، لهُ الملكُ ولهُ الحَمد، وهوَ على كلّ شيءٍ قدير، لا حَـوْلَ وَلا قـوَّةَ إِلاّ بِاللهِ، لا إلهَ إلاّ اللّـه، وَلا نَعْـبُـدُ إِلاّ إيّـاه, لَهُ النِّعْـمَةُ وَلَهُ الفَضْل وَلَهُ الثَّـناءُ الحَـسَن، لا إلهَ إلاّ اللّهُ مخْلِصـينَ لَـهُ الدِّينَ وَلَوْ كَـرِهَ الكـافِرون."
        txt3.text = "سُـبْحانَ اللهِ، والحَمْـدُ لله ، واللهُ أكْـبَر. "
        txt4.text = "لا إلهَ إلاّ اللّهُ وَحْـدَهُ لا شريكَ لهُ، لهُ الملكُ ولهُ الحَمْد، وهُوَ على كُلّ شَيءٍ قَـدير."
        txt5.text = "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ هُوَ ٱللَّهُ أَحَدٌ، ٱللَّهُ ٱلصَّمَدُ، لَمْ يَلِدْ وَلَمْ يُولَدْ، وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ.\n" +
                "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ أَعُوذُ بِرَبِّ ٱلْفَلَقِ، مِن شَرِّ مَا خَلَقَ، وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ، وَمِن شَرِّ ٱلنَّفَّٰثَٰتِ فِى ٱلْعُقَدِ، وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ.\n" +
                "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ أَعُوذُ بِرَبِّ ٱلنَّاسِ، مَلِكِ ٱلنَّاسِ، إِلَٰهِ ٱلنَّاسِ، مِن شَرِّ ٱلْوَسْوَاسِ ٱلْخَنَّاسِ، ٱلَّذِى يُوَسْوِسُ فِى صُدُورِ ٱلنَّاسِ، مِنَ ٱلْجِنَّةِ وَٱلنَّاسِ.\n"


        var x1 = 0
        fun sum(){
            x1++
            if (x1 == 50){
                Toast.makeText(this,"سبحان الله وبحمده سبحان الله العظيم", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        txtreapetastgfer.setOnClickListener {
            reapet(txtreapetnumastgfer,txtreapetnumastgfer,txt,txtreapetastgfer,y)
            sum()
        }
        txtreapetsobhanallah.setOnClickListener {
            reapet(txtreapetnumsobhanallah,txtreapetnumsobhanallah,txt1,txtreapetsobhanallah,x)
        sum()
        }
        txtreapetalhmsly.setOnClickListener {
            reapet(txtreapetnumalhmsly,txtreapetnumalhmsly,txt2,txtreapetalhmsly,v)
        sum()
        }
        txtreapetaoth.setOnClickListener {
            reapet(txtreapetnumaoth,txtreapetnumaoth,txt3,txtreapetaoth,u)
            sum()
        }
        fun repeat (txtsize:TextView, txtnum:TextView, txtstr:TextView, txtreapetL:TextView, ts:LinearLayout,tx:TextView){
            var size = Integer.parseInt(txtsize.text.toString())
            size--
            txtnum.text = size .toString()
            if (size == 0){
                txtstr.visibility = View.GONE
                txtnum.visibility = View.GONE
                txtreapetL.visibility = View.GONE
                ts.visibility = View.GONE
                tx.visibility = View.GONE
            }
        }
        txtreapetalhmalm.setOnClickListener {
            repeat(txtreapetnumalhmalm,txtreapetnumalhmalm,txt4,txtreapetalhmalm,t,ts)
            sum()
        }
        fun repea (txtsize:TextView, txtnum:TextView, txtstr:TextView, txtreapetL:TextView, ts:LinearLayout,tx:TextView,tn:TextView){
            var size = Integer.parseInt(txtsize.text.toString())
            size--
            txtnum.text = size .toString()
            if (size == 0){
                txtstr.visibility = View.GONE
                txtnum.visibility = View.GONE
                txtreapetL.visibility = View.GONE
                ts.visibility = View.GONE
                tx.visibility = View.GONE
                tn.visibility = View.GONE
            }
        }
        txtreapetyahy.setOnClickListener {
            repea(txtreapetnumyahy,txtreapetnumyahy,txt5,txtreapetyahy,s,magrb,other)
            sum()
        }
        txtreapetalhmanyasalk.setOnClickListener {
            reapet(txtreapetnumalhmanyasalk,txtreapetnumalhmanyasalk,txt6,txtreapetalhmanyasalk,r)
            sum()
        }
        other.setOnClickListener {
            txtreapetnumyahy.text = "1"
        }
        magrb.setOnClickListener {
            txtreapetnumyahy.text = "3"
        }
        fun font(txt:TextView){
            txt.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        }
        font(txt)
        font(txt1)
        font(txt2)
        font(txt3)
        font(txt4)
        font(txt5)
        font(txt6)

    }

    private fun reapet (txtsize:TextView,
                        txtnum:TextView,
                        txtstr:TextView,
                        txtreapetL:TextView,
                        ts:LinearLayout){

        var size = Integer.parseInt(txtsize.text.toString())
        size--
        txtnum.text = size .toString()
        if (size == 0){
            txtstr.visibility = View.GONE
            txtnum.visibility = View.GONE
            txtreapetL.visibility = View.GONE
            ts.visibility = View.GONE

        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var infl = menuInflater
        infl.inflate(R.menu.menu,menu)
        return true


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        var s = Integer.parseInt(size.text.toString())

        when(item?.itemId){
            R.id.goback ->{
                Toast.makeText(this,"سبحان الله وبحمده سبحان الله العظيم", Toast.LENGTH_SHORT).show()
                finish()
            }
            R.id.zoomin -> {
                s++
                if(s > 30){
                    s = 30
                    Toast.makeText(this,"لا يمكن التكبير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txt.textSize = s.toFloat()
                txt1.textSize = s.toFloat()
                txt2.textSize = s.toFloat()
                txt3.textSize = s.toFloat()
                txt4.textSize = s.toFloat()
                txt5.textSize = s.toFloat()
                txt6.textSize = s.toFloat()

            }
            R.id.zoomout -> {
                s--
                if(s < 16){
                    s = 16
                    Toast.makeText(this,"لا يمكن التصغير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txt.textSize = s.toFloat()
                txt1.textSize = s.toFloat()
                txt2.textSize = s.toFloat()
                txt3.textSize = s.toFloat()
                txt4.textSize = s.toFloat()
                txt5.textSize = s.toFloat()
                txt6.textSize = s.toFloat()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
