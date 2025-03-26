package com.google.android.gms.common.api;

import Z2.r;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.C1108g;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C1091c;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: o, reason: collision with root package name */
    protected int f13212o = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i8, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i8);
        intent.putExtra("notify_manager", z7);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            C1108g.m().n(this, ((Integer) r.l(num)).intValue(), 2, this);
            this.f13212o = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f13212o = 1;
        } catch (ActivityNotFoundException e8) {
            if (extras.getBoolean("notify_manager", true)) {
                C1091c.t(this).E(new C1103b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", str, e8);
            }
            this.f13212o = 1;
            finish();
        } catch (IntentSender.SendIntentException e9) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f13212o = 0;
            setResult(i9, intent);
            if (booleanExtra) {
                C1091c t7 = C1091c.t(this);
                if (i9 == -1) {
                    t7.F();
                } else if (i9 == 0) {
                    t7.E(new C1103b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i8 == 2) {
            this.f13212o = 0;
            setResult(i9, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f13212o = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f13212o = bundle.getInt("resolution");
        }
        if (this.f13212o != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f13212o);
        super.onSaveInstanceState(bundle);
    }
}
