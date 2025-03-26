package Z2;

import X2.InterfaceC0759g;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class G implements DialogInterface.OnClickListener {
    public static G b(Activity activity, Intent intent, int i8) {
        return new D(intent, activity, i8);
    }

    public static G c(Fragment fragment, Intent intent, int i8) {
        return new E(intent, fragment, i8);
    }

    public static G d(InterfaceC0759g interfaceC0759g, Intent intent, int i8) {
        return new F(intent, interfaceC0759g, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e8) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e8);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
