package fi.petrikallio.labyrintti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import fi.petrikallio.labyrintti.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val binding: FragmentTitleBinding = DataBindingUtil.inflate(
      inflater,
      R.layout.fragment_title,
      container,
      false
    )

    return binding.root
  }
}