package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5688z0;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import com.headcode.ourgroceries.android.P1;
import com.headcode.ourgroceries.android.V1;
import com.headcode.ourgroceries.android.Z0;
import n5.C6259i;

/* renamed from: o5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6296e extends DialogInterfaceOnCancelListenerC0906e {

    /* renamed from: o5.e$a */
    public interface a {
        void R(Z0 z02);
    }

    public static DialogInterfaceOnCancelListenerC0906e A2() {
        return new C6296e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(EditText editText, InputMethodManager inputMethodManager, AlertDialog alertDialog, C5574j1 c5574j1, View view) {
        String trim = editText.getText().toString().trim();
        if (trim.length() == 0) {
            P1.A(inputMethodManager, editText);
            alertDialog.dismiss();
            return;
        }
        C5688z0 D7 = c5574j1.D();
        if ((D7 == null ? null : D7.I(trim)) != null) {
            V1.e(view, J1().getString(M2.f34090h1, trim), true);
            return;
        }
        Z0 j8 = c5574j1.j(trim);
        if (j8 != null) {
            ((a) J1()).R(j8);
        }
        P1.A(inputMethodManager, editText);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean y2(Button button, TextView textView, int i8, KeyEvent keyEvent) {
        button.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(final AlertDialog alertDialog, final EditText editText, final InputMethodManager inputMethodManager, final C5574j1 c5574j1, DialogInterface dialogInterface) {
        final Button button = alertDialog.getButton(-1);
        button.setOnClickListener(new View.OnClickListener() { // from class: o5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39935o.x2(editText, inputMethodManager, alertDialog, c5574j1, view);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o5.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return C6296e.y2(button, textView, i8, keyEvent);
            }
        });
        P1.T(OurApplication.j(), inputMethodManager, editText);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void G0(Context context) {
        super.G0(context);
        AbstractActivityC0911j J12 = J1();
        if (J12 instanceof a) {
            return;
        }
        throw new ClassCastException(J12 + " must implement AddCategoryDialog.Listener");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        AbstractActivityC0911j J12 = J1();
        final C5574j1 i8 = ((OurApplication) J12.getApplication()).i();
        final InputMethodManager inputMethodManager = (InputMethodManager) J12.getSystemService("input_method");
        C6259i c8 = C6259i.c(J12.getLayoutInflater());
        final EditText editText = c8.f39670b;
        editText.setHint(M2.f34057d0);
        final AlertDialog create = new AlertDialog.Builder(J12).setTitle(M2.f34121l0).setIcon(G2.f33459g).setView(c8.b()).setPositiveButton(M2.f33952Q, (DialogInterface.OnClickListener) null).setNegativeButton(M2.f33984U, new DialogInterface.OnClickListener() { // from class: o5.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                P1.A(inputMethodManager, editText);
            }
        }).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o5.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f39926a.z2(create, editText, inputMethodManager, i8, dialogInterface);
            }
        });
        return create;
    }
}
