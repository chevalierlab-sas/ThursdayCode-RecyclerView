package lab.chevalier.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import lab.chevalier.recyclerviewexample.databinding.ItemSiswaBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.SiswaViewHolder>() {

    var listData : List<Siswa> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class SiswaViewHolder(val binding: ItemSiswaBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : Siswa){
            binding.tvNama.text = data.nama
            binding.tvKelas.text = data.kelas
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaViewHolder = SiswaViewHolder(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_siswa, parent, false)
    )

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: SiswaViewHolder, position: Int) {
        holder.bind(listData[position])
    }

}