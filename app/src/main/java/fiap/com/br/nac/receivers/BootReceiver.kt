package fiap.com.br.nac.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Um programa suspeito (Conscientizador) está rodando em background!", Toast.LENGTH_SHORT).show()
    }
}