package kr.co.bullets.part3chapter5.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import kr.co.bullets.part3chapter5.databinding.ItemVideoBinding
import kr.co.bullets.part3chapter5.list.ItemHandler
import kr.co.bullets.part3chapter5.model.ListItem
import kr.co.bullets.part3chapter5.model.VideoItem

class VideoViewHolder(private val binding: ItemVideoBinding, private val itemHandler: ItemHandler? = null) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as VideoItem
        binding.item = item
        binding.handler = itemHandler
    }
}