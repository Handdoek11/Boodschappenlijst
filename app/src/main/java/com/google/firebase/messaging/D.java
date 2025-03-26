package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.InterfaceC0369c;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f32842a;

    /* renamed from: b, reason: collision with root package name */
    private final I f32843b;

    /* renamed from: c, reason: collision with root package name */
    private final V2.c f32844c;

    /* renamed from: d, reason: collision with root package name */
    private final H4.b f32845d;

    /* renamed from: e, reason: collision with root package name */
    private final H4.b f32846e;

    /* renamed from: f, reason: collision with root package name */
    private final I4.e f32847f;

    D(com.google.firebase.f fVar, I i8, H4.b bVar, H4.b bVar2, I4.e eVar) {
        this(fVar, i8, new V2.c(fVar.k()), bVar, bVar2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC0376j c(AbstractC0376j abstractC0376j) {
        return abstractC0376j.k(new Z0.m(), new InterfaceC0369c() { // from class: com.google.firebase.messaging.C
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j2) {
                return this.f32841a.i(abstractC0376j2);
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f32842a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(AbstractC0376j abstractC0376j) {
        return g((Bundle) abstractC0376j.p(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            com.google.firebase.f r3 = r2.f32842a
            com.google.firebase.n r3 = r3.n()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f32843b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f32843b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f32843b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r5.putString(r3, r4)
            I4.e r3 = r2.f32847f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            A3.j r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = A3.AbstractC0379m.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            com.google.firebase.installations.f r3 = (com.google.firebase.installations.f) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            I4.e r3 = r2.f32847f
            A3.j r3 = r3.d()
            java.lang.Object r3 = A3.AbstractC0379m.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "24.1.0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            H4.b r3 = r2.f32846e
            java.lang.Object r3 = r3.get()
            F4.j r3 = (F4.j) r3
            H4.b r4 = r2.f32845d
            java.lang.Object r4 = r4.get()
            P4.i r4 = (P4.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            F4.j$a r3 = r3.b(r0)
            F4.j$a r0 = F4.j.a.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.c()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.D.j(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private AbstractC0376j l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f32844c.c(bundle);
        } catch (InterruptedException | ExecutionException e8) {
            return AbstractC0379m.d(e8);
        }
    }

    AbstractC0376j e() {
        return this.f32844c.a();
    }

    AbstractC0376j f() {
        return c(l(I.c(this.f32842a), "*", new Bundle()));
    }

    AbstractC0376j k(boolean z7) {
        return this.f32844c.d(z7);
    }

    AbstractC0376j m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(l(str, "/topics/" + str2, bundle));
    }

    AbstractC0376j n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(l(str, "/topics/" + str2, bundle));
    }

    D(com.google.firebase.f fVar, I i8, V2.c cVar, H4.b bVar, H4.b bVar2, I4.e eVar) {
        this.f32842a = fVar;
        this.f32843b = i8;
        this.f32844c = cVar;
        this.f32845d = bVar;
        this.f32846e = bVar2;
        this.f32847f = eVar;
    }
}
