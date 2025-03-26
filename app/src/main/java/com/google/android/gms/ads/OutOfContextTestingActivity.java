package com.google.android.gms.ads;

import D2.C0555y;
import D2.Q0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.BinderC4830zl;
import i3.BinderC5853b;
import w2.q;
import w2.r;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q0 f8 = C0555y.a().f(this, new BinderC4830zl());
        if (f8 == null) {
            finish();
            return;
        }
        setContentView(r.f44295a);
        LinearLayout linearLayout = (LinearLayout) findViewById(q.f44294a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            f8.h7(stringExtra, BinderC5853b.p2(this), BinderC5853b.p2(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
