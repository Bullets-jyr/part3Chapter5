package kr.co.bullets.part3chapter5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.bullets.part3chapter5.databinding.FragmentFavoritesBinding

class FavoritesFragment : Fragment() {
    private var binding: FragmentFavoritesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return FragmentFavoritesBinding.inflate(inflater, container, false).apply {
            binding = this
        }.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}