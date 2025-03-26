package G2;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: G2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0622x implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Context f2724o;

    DialogInterfaceOnClickListenerC0622x(RunnableC0623y runnableC0623y, Context context) {
        this.f2724o = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        C2.v.t();
        D0.u(this.f2724o, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
