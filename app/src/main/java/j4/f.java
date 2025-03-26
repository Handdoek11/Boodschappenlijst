package j4;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import m4.AbstractC6203i;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38241a;

    /* renamed from: b, reason: collision with root package name */
    private b f38242b = null;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f38243a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38244b;

        private b() {
            int p8 = AbstractC6203i.p(f.this.f38241a, "com.google.firebase.crashlytics.unity_version", "string");
            if (p8 == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f38243a = null;
                    this.f38244b = null;
                    return;
                } else {
                    this.f38243a = "Flutter";
                    this.f38244b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f38243a = "Unity";
            String string = f.this.f38241a.getResources().getString(p8);
            this.f38244b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f38241a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f38241a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f38241a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f38242b == null) {
            this.f38242b = new b();
        }
        return this.f38242b;
    }

    public String d() {
        return f().f38243a;
    }

    public String e() {
        return f().f38244b;
    }
}
