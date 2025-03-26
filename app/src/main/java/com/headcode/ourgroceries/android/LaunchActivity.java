package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.headcode.ourgroceries.android.AbstractC5517c0;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class LaunchActivity extends AbstractActivityC5575j2 {
    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z7 = V.e(this) || Build.VERSION.SDK_INT < 24;
        boolean b8 = V.b(this);
        boolean z8 = A2.f33140n0.v() == s5.X.IN_PROGRESS;
        if ((b8 || z8) && !z7) {
            Intent intent = new Intent(this, (Class<?>) WelcomeActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(268468224);
            Intent intent2 = getIntent();
            if (intent2 != null && AbstractC5517c0.d(intent2) && AbstractC5517c0.a.c(intent2.getData()) == AbstractC5517c0.a.ACCEPT_INVITE) {
                AbstractC6635a.d("OG-Launch", "onCreate: handling accept invite FDL directly");
                intent.setData(intent2.getData());
                intent.putExtras(intent2.getExtras());
            }
            startActivity(intent);
        } else {
            AbstractC5625q.e(V0().x(A2.f33140n0.q()), this);
        }
        finish();
    }
}
