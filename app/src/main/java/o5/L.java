package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
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
import n5.C6259i;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class L extends DialogInterfaceOnCancelListenerC0906e {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39902a;

        static {
            int[] iArr = new int[s5.Q.values().length];
            f39902a = iArr;
            try {
                iArr[s5.Q.SHOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39902a[s5.Q.RECIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void d(C5688z0 c5688z0);

        void q(C5688z0 c5688z0);
    }

    public static DialogInterfaceOnCancelListenerC0906e A2(s5.Q q8) {
        L l8 = new L();
        Bundle bundle = new Bundle();
        bundle.putSerializable("listType", q8);
        l8.R1(bundle);
        return l8;
    }

    public static DialogInterfaceOnCancelListenerC0906e B2(String str, s5.Q q8) {
        L l8 = new L();
        Bundle bundle = new Bundle();
        bundle.putString("listId", str);
        bundle.putSerializable("listType", q8);
        l8.R1(bundle);
        return l8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x2(EditText editText, C5688z0 c5688z0, InputMethodManager inputMethodManager, AlertDialog alertDialog, C5574j1 c5574j1, AbstractActivityC0911j abstractActivityC0911j, s5.Q q8, View view) {
        Editable text = editText.getText();
        String trim = text == null ? null : text.toString().trim();
        if (AbstractC6803e.o(trim) || (c5688z0 != null && trim.equals(c5688z0.W()))) {
            P1.A(inputMethodManager, editText);
            alertDialog.dismiss();
            return;
        }
        C5688z0 y7 = c5574j1.y(trim);
        if (y7 != null) {
            V1.e(view, abstractActivityC0911j.getString(y7.U() == s5.Q.SHOPPING ? M2.f33987U2 : M2.f33995V2, trim), true);
            return;
        }
        if (c5688z0 == null) {
            C5688z0 t7 = c5574j1.t(q8, trim);
            if (t7 != null) {
                ((b) abstractActivityC0911j).q(t7);
            }
        } else {
            c5574j1.z0(c5688z0, trim);
            ((b) abstractActivityC0911j).d(c5688z0);
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
    public static /* synthetic */ void z2(final AlertDialog alertDialog, final EditText editText, final C5688z0 c5688z0, final InputMethodManager inputMethodManager, final C5574j1 c5574j1, final AbstractActivityC0911j abstractActivityC0911j, final s5.Q q8, DialogInterface dialogInterface) {
        final Button button = alertDialog.getButton(-1);
        button.setOnClickListener(new View.OnClickListener() { // from class: o5.J
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L.x2(editText, c5688z0, inputMethodManager, alertDialog, c5574j1, abstractActivityC0911j, q8, view);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o5.K
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return L.y2(button, textView, i8, keyEvent);
            }
        });
        P1.T(OurApplication.j(), inputMethodManager, editText);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void G0(Context context) {
        super.G0(context);
        AbstractActivityC0911j J12 = J1();
        if (J12 instanceof b) {
            return;
        }
        throw new ClassCastException(J12 + " must implement ListNameDialog.Listener");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        int i8;
        int i9;
        int i10;
        Bundle K12 = K1();
        String string = K12.getString("listId");
        final s5.Q q8 = (s5.Q) P1.s(K12, "listType", s5.Q.class);
        final AbstractActivityC0911j J12 = J1();
        final C5574j1 i11 = ((OurApplication) J12.getApplication()).i();
        final InputMethodManager inputMethodManager = (InputMethodManager) J12.getSystemService("input_method");
        C5688z0 x7 = string == null ? null : i11.x(string);
        if (a.f39902a[q8.ordinal()] != 2) {
            if (string == null) {
                i8 = M2.f34129m0;
                i9 = M2.f33968S;
            } else {
                i8 = M2.f34217x0;
                i9 = M2.f34041b0;
            }
            i10 = M2.f34073f0;
        } else {
            if (string == null) {
                i8 = M2.f34137n0;
                i9 = M2.f33976T;
            } else {
                i8 = M2.f34225y0;
                i9 = M2.f34049c0;
            }
            i10 = M2.f34065e0;
        }
        C6259i c8 = C6259i.c(J12.getLayoutInflater());
        final EditText editText = c8.f39670b;
        editText.setHint(i10);
        if (P1.C("fr")) {
            editText.setInputType((editText.getInputType() & (-8193)) | 16384);
        }
        final AlertDialog create = new AlertDialog.Builder(J12).setTitle(i8).setIcon(G2.f33459g).setView(c8.b()).setPositiveButton(i9, (DialogInterface.OnClickListener) null).setNegativeButton(M2.f33984U, new DialogInterface.OnClickListener() { // from class: o5.H
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                P1.A(inputMethodManager, editText);
            }
        }).create();
        final C5688z0 c5688z0 = x7;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o5.I
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                L.z2(create, editText, c5688z0, inputMethodManager, i11, J12, q8, dialogInterface);
            }
        });
        if (x7 != null) {
            editText.setText(x7.W());
            editText.setSelection(editText.getText().length());
        }
        return create;
    }
}
