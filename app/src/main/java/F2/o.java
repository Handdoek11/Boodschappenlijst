package F2;

import android.view.View;

/* loaded from: classes.dex */
final class o implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ x f2271o;

    o(x xVar) {
        this.f2271o = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x xVar = this.f2271o;
        xVar.f2294M = 2;
        xVar.f2295o.finish();
    }
}
