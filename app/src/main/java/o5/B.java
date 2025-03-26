package o5;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;

/* loaded from: classes2.dex */
public abstract class B {
    static AlertDialog a(Activity activity, int i8, int i9, DialogInterface.OnClickListener onClickListener, String str) {
        return new AlertDialog.Builder(activity).setTitle(i8).setIcon(G2.f33459g).setMessage(str).setPositiveButton(i9, onClickListener).setNegativeButton(M2.f33984U, (DialogInterface.OnClickListener) null).create();
    }
}
