package kr.co.bullets.part3chapter5.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import kr.co.bullets.part3chapter5.databinding.ItemImageBinding
import kr.co.bullets.part3chapter5.model.ImageItem
import kr.co.bullets.part3chapter5.model.ListItem

class ImageViewHolder(private val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as ImageItem
        binding.item = item
    }
}