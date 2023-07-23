package kr.co.bullets.part3chapter5.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import kr.co.bullets.part3chapter5.databinding.ItemImageBinding
import kr.co.bullets.part3chapter5.list.ItemHandler
import kr.co.bullets.part3chapter5.model.ImageItem
import kr.co.bullets.part3chapter5.model.ListItem

class ImageViewHolder(private val binding: ItemImageBinding, private val itemHandler: ItemHandler? = null) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as ImageItem
        binding.item = item
        binding.handler = itemHandler
    }
}