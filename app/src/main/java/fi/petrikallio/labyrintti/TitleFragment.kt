package fi.petrikallio.labyrintti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
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

    binding.btnStart.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_mainMenuFragment))

    return binding.root
  }
}
