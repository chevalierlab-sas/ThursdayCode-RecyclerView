package lab.chevalier.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import lab.chevalier.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val listSiswa = mutableListOf<Siswa>()

        listSiswa.add(Siswa("Ade Resie Muchorobbi Setiawan","MIA 5"))
        listSiswa.add(Siswa("Teguh Arik Ardiansyah","MIA 5"))
        listSiswa.add(Siswa("Linda Sri Rahayu","MIA 5"))
        listSiswa.add(Siswa("Nanang Wahyudi","IIS 1"))
        listSiswa.add(Siswa("Lukman Hari Prasetyo","IIS 1"))
        listSiswa.add(Siswa("Prasetyo Nugroho","IIS 4"))

        binding.rvSiswa.apply {
            this.adapter = MyAdapter().apply {
                this.listData = listSiswa
            }
            this.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}
