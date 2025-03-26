package p3;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.zzg;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: p3.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6329a0 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40231a;

    /* renamed from: b, reason: collision with root package name */
    private final W f40232b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f40233c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f40234d;

    /* renamed from: e, reason: collision with root package name */
    private final U0 f40235e;

    /* renamed from: f, reason: collision with root package name */
    private final C6350l f40236f;

    /* renamed from: g, reason: collision with root package name */
    private final C6377z f40237g;

    /* renamed from: h, reason: collision with root package name */
    private final C6354n f40238h;

    C6329a0(Application application, W w7, Handler handler, Executor executor, U0 u02, C6350l c6350l, C6377z c6377z, C6354n c6354n) {
        this.f40231a = application;
        this.f40232b = w7;
        this.f40233c = handler;
        this.f40234d = executor;
        this.f40235e = u02;
        this.f40236f = c6350l;
        this.f40237g = c6377z;
        this.f40238h = c6354n;
    }

    private final void f(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.f40232b.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e8) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // p3.E0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = -1
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1370505102: goto L2b;
                case -278739366: goto L21;
                case 150940456: goto L17;
                case 1671672458: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r0 = "dismiss"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = r5
            goto L36
        L17:
            java.lang.String r0 = "browser"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = r3
            goto L36
        L21:
            java.lang.String r0 = "configure_app_assets"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = r4
            goto L36
        L2b:
            java.lang.String r0 = "load_complete"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L35
            r7 = r2
            goto L36
        L35:
            r7 = r1
        L36:
            if (r7 == 0) goto La4
            if (r7 == r5) goto L47
            if (r7 == r3) goto L43
            if (r7 == r4) goto L3f
            return r2
        L3f:
            r6.b()
            return r5
        L43:
            r6.f(r8)
            return r5
        L47:
            java.lang.String r7 = "status"
            java.lang.String r7 = r8.optString(r7)
            int r8 = r7.hashCode()
            r0 = 4
            switch(r8) {
                case -954325659: goto L7e;
                case -258041904: goto L74;
                case 429411856: goto L6a;
                case 467888915: goto L60;
                case 1666911234: goto L56;
                default: goto L55;
            }
        L55:
            goto L87
        L56:
            java.lang.String r8 = "non_personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = r3
            goto L87
        L60:
            java.lang.String r8 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = r5
            goto L87
        L6a:
            java.lang.String r8 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = r0
            goto L87
        L74:
            java.lang.String r8 = "personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = r2
            goto L87
        L7e:
            java.lang.String r8 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            r1 = r4
        L87:
            if (r1 == 0) goto L9e
            if (r1 == r5) goto L9e
            if (r1 == r3) goto L9e
            if (r1 == r4) goto L9e
            if (r1 == r0) goto L9e
            p3.z r7 = r6.f40237g
            com.google.android.gms.internal.consent_sdk.zzg r8 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = "We are getting something wrong with the webview."
            r8.<init>(r5, r0)
            r7.i(r8)
            goto La3
        L9e:
            p3.z r7 = r6.f40237g
            r7.h(r4)
        La3:
            return r5
        La4:
            p3.z r7 = r6.f40237g
            r7.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C6329a0.a(java.lang.String, org.json.JSONObject):boolean");
    }

    public final void b() {
        this.f40234d.execute(new Runnable() { // from class: p3.Z
            @Override // java.lang.Runnable
            public final void run() {
                this.f40226o.c();
            }
        });
    }

    final /* synthetic */ void c() {
        String concat;
        JSONObject jSONObject = new JSONObject();
        Application application = this.f40231a;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.f40238h.c().keySet()) {
                jSONObject2.put(str, this.f40238h.c().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        this.f40237g.d().d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    final void d(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.f40235e.b(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.f40236f);
    }

    final void e(int i8, String str, String str2) {
        this.f40237g.k(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i8), str2, str)));
    }

    @Override // p3.E0
    public final Executor zza() {
        final Handler handler = this.f40233c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: p3.Y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
