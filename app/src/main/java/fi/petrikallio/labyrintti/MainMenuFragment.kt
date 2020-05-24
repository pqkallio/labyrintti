package fi.petrikallio.labyrintti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import fi.petrikallio.labyrintti.databinding.FragmentMainMenuBinding

class MainMenuFragment : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val binding: FragmentMainMenuBinding = DataBindingUtil.inflate(
      inflater,
      R.layout.fragment_main_menu,
      container,
      false
    )

    return binding.root
  }
}
