package com.example.ceria.ui.auth.login

import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.ceria.R
import com.example.ceria.databinding.FragmentLoginBinding
import com.example.ceria.util.AuthSelector


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.apply {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {

            }

            etPhone.setOnEditorActionListener { _, actionId, event ->
                if (event != null && event.keyCode === KeyEvent.KEYCODE_ENTER || actionId == EditorInfo.IME_ACTION_DONE) {
                    //do what you want on the press of 'done'
                    btnLogin.setOnClickListener {
                        findNavController().navigate(R.id.action_loginFragment_to_otpVerificationFragment)
                    }
                }
                false
            }
            btnLogin.isEnabled = true
            setClickListener {
                when (it.id) {
                    R.id.btn_login -> {
                        it.findNavController().navigate(R.id.action_loginFragment_to_inputPinFragment)
                    }
                    /*R.id.btn_login -> {
                        val direction =
                            LoginFragmentDirections.actionLoginFragmentToOtpVerificationFragment(
                                AuthSelector.LOGIN
                            )
                        it.findNavController().navigate(direction)
                    }*/
                    R.id.tv_signup_login -> {
                        it.findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
                    }
                }
            }
        }
    }

}