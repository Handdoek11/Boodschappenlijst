package G2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: G2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0623y implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Context f2728o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f2729s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f2730t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ boolean f2731u;

    RunnableC0623y(C0624z c0624z, Context context, String str, boolean z7, boolean z8) {
        this.f2728o = context;
        this.f2729s = str;
        this.f2730t = z7;
        this.f2731u = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2.v.t();
        AlertDialog.Builder l8 = D0.l(this.f2728o);
        l8.setMessage(this.f2729s);
        if (this.f2730t) {
            l8.setTitle("Error");
        } else {
            l8.setTitle("Info");
        }
        if (this.f2731u) {
            l8.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            l8.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC0622x(this, this.f2728o));
            l8.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        l8.create().show();
    }
}
