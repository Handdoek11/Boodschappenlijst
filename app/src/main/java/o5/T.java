package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class T extends DialogInterfaceOnCancelListenerC0906e {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        Bundle f39913a;

        public b a(int i8) {
            this.f39913a.putInt("continuation", i8);
            return this;
        }

        public b b(int i8) {
            this.f39913a.putInt("iconId", i8);
            return this;
        }

        public b c(int i8) {
            this.f39913a.putInt("iconAttribute", i8);
            return this;
        }

        public b d(int i8) {
            this.f39913a.putInt("messageId", i8);
            return this;
        }

        public b e(String str) {
            this.f39913a.putString("message", str);
            return this;
        }

        public b f(int i8) {
            this.f39913a.putInt("titleId", i8);
            return this;
        }

        public void g(AbstractActivityC0911j abstractActivityC0911j) {
            h(abstractActivityC0911j.getSupportFragmentManager());
        }

        public void h(androidx.fragment.app.w wVar) {
            T t7 = new T();
            t7.R1(this.f39913a);
            try {
                t7.r2(wVar, "unused");
            } catch (IllegalStateException e8) {
                AbstractC6635a.f("OG-OkDialog", "Got exception showing dialog box: " + e8);
            }
        }

        private b() {
            this.f39913a = new Bundle();
        }
    }

    public interface c {
        void a(int i8);
    }

    public static b t2() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(boolean z7, int i8, DialogInterface dialogInterface, int i9) {
        LayoutInflater.Factory p8;
        if (!z7 || (p8 = p()) == null) {
            return;
        }
        if (!(p8 instanceof c)) {
            throw new IllegalStateException("Activity must implement Listener");
        }
        ((c) p8).a(i8);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        Bundle K12 = K1();
        final boolean containsKey = K12.containsKey("continuation");
        final int i8 = containsKey ? K12.getInt("continuation") : 0;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(p()).setPositiveButton(M2.f33946P1, new DialogInterface.OnClickListener() { // from class: o5.S
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f39910o.u2(containsKey, i8, dialogInterface, i9);
            }
        });
        if (K12.containsKey("iconAttribute")) {
            positiveButton.setIconAttribute(K12.getInt("iconAttribute"));
        } else if (K12.containsKey("iconId")) {
            positiveButton.setIcon(K12.getInt("iconId"));
        } else {
            positiveButton.setIcon(G2.f33459g);
        }
        if (K12.containsKey("titleId")) {
            positiveButton.setTitle(K12.getInt("titleId"));
        }
        if (K12.containsKey("messageId")) {
            positiveButton.setMessage(K12.getInt("messageId"));
        } else {
            if (!K12.containsKey("message")) {
                throw new IllegalStateException("Must specify message for dialog");
            }
            positiveButton.setMessage(K12.getString("message"));
        }
        return positiveButton.create();
    }
}
