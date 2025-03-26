package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC5483i {

    /* renamed from: x, reason: collision with root package name */
    private static final Queue f32873x = new ArrayDeque(10);

    /* renamed from: w, reason: collision with root package name */
    private V2.c f32874w;

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f32873x;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (J.t(extras)) {
            J j8 = new J(extras);
            ExecutorService e8 = AbstractC5489o.e();
            try {
                if (new C5480f(this, j8, e8).a()) {
                    return;
                }
                e8.shutdown();
                if (H.D(intent)) {
                    H.w(intent);
                }
            } finally {
                e8.shutdown();
            }
        }
        r(new S(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private V2.c o(Context context) {
        if (this.f32874w == null) {
            this.f32874w = new V2.c(context.getApplicationContext());
        }
        return this.f32874w;
    }

    private void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).b(new V2.a(intent));
    }

    private void v(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                q();
                break;
            case "gcm":
                H.y(intent);
                m(intent);
                break;
            case "send_error":
                u(n(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                s(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC5483i
    protected Intent e(Intent intent) {
        return W.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC5483i
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void q() {
    }

    public void r(S s8) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }
}
