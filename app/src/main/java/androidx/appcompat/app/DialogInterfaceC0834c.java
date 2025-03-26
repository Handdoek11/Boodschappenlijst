package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import f.AbstractC5752a;

/* renamed from: androidx.appcompat.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceC0834c extends y implements DialogInterface {

    /* renamed from: w, reason: collision with root package name */
    final AlertController f6848w;

    /* renamed from: androidx.appcompat.app.c$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f6849a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6850b;

        public a(Context context) {
            this(context, DialogInterfaceC0834c.k(context, 0));
        }

        public DialogInterfaceC0834c a() {
            DialogInterfaceC0834c dialogInterfaceC0834c = new DialogInterfaceC0834c(this.f6849a.f6735a, this.f6850b);
            this.f6849a.a(dialogInterfaceC0834c.f6848w);
            dialogInterfaceC0834c.setCancelable(this.f6849a.f6752r);
            if (this.f6849a.f6752r) {
                dialogInterfaceC0834c.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0834c.setOnCancelListener(this.f6849a.f6753s);
            dialogInterfaceC0834c.setOnDismissListener(this.f6849a.f6754t);
            DialogInterface.OnKeyListener onKeyListener = this.f6849a.f6755u;
            if (onKeyListener != null) {
                dialogInterfaceC0834c.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0834c;
        }

        public Context b() {
            return this.f6849a.f6735a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6849a;
            bVar.f6757w = listAdapter;
            bVar.f6758x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f6849a.f6741g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f6849a.f6738d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f6849a.f6742h = charSequence;
            return this;
        }

        public a g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f6849a;
            bVar.f6756v = charSequenceArr;
            bVar.f6729J = onMultiChoiceClickListener;
            bVar.f6725F = zArr;
            bVar.f6726G = true;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6849a;
            bVar.f6746l = charSequence;
            bVar.f6748n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f6849a.f6755u = onKeyListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6849a;
            bVar.f6743i = charSequence;
            bVar.f6745k = onClickListener;
            return this;
        }

        public a k(ListAdapter listAdapter, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6849a;
            bVar.f6757w = listAdapter;
            bVar.f6758x = onClickListener;
            bVar.f6728I = i8;
            bVar.f6727H = true;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6849a;
            bVar.f6756v = charSequenceArr;
            bVar.f6758x = onClickListener;
            bVar.f6728I = i8;
            bVar.f6727H = true;
            return this;
        }

        public a m(CharSequence charSequence) {
            this.f6849a.f6740f = charSequence;
            return this;
        }

        public a n(View view) {
            AlertController.b bVar = this.f6849a;
            bVar.f6760z = view;
            bVar.f6759y = 0;
            bVar.f6724E = false;
            return this;
        }

        public a(Context context, int i8) {
            this.f6849a = new AlertController.b(new ContextThemeWrapper(context, DialogInterfaceC0834c.k(context, i8)));
            this.f6850b = i8;
        }
    }

    protected DialogInterfaceC0834c(Context context, int i8) {
        super(context, k(context, i8));
        this.f6848w = new AlertController(getContext(), this, getWindow());
    }

    static int k(Context context, int i8) {
        if (((i8 >>> 24) & 255) >= 1) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5752a.f35385l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView j() {
        return this.f6848w.d();
    }

    @Override // androidx.appcompat.app.y, androidx.activity.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6848w.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (this.f6848w.f(i8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (this.f6848w.g(i8, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i8, keyEvent);
    }

    @Override // androidx.appcompat.app.y, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f6848w.p(charSequence);
    }
}
