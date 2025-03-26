package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final b f9618a;

        public a(b bVar) {
            this.f9618a = bVar == null ? e() : bVar;
        }

        private f.c a(Context context, w0.f fVar) {
            if (fVar == null) {
                return null;
            }
            return new k(context, fVar);
        }

        private List b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private w0.f d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new w0.f(str, str2, "emojicompat-emoji-font", b(this.f9618a.b(packageManager, str2)));
        }

        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0159d() : new c();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        private ProviderInfo g(PackageManager packageManager) {
            Iterator it = this.f9618a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo a8 = this.f9618a.a((ResolveInfo) it.next());
                if (f(a8)) {
                    return a8;
                }
            }
            return null;
        }

        public f.c c(Context context) {
            return a(context, h(context));
        }

        w0.f h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            y0.i.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g8 = g(packageManager);
            if (g8 == null) {
                return null;
            }
            try {
                return d(g8, packageManager);
            } catch (PackageManager.NameNotFoundException e8) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e8);
                return null;
            }
        }
    }

    public static class b {
        public abstract ProviderInfo a(ResolveInfo resolveInfo);

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public abstract List c(PackageManager packageManager, Intent intent, int i8);
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.d.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.d.b
        public List c(PackageManager packageManager, Intent intent, int i8) {
            return packageManager.queryIntentContentProviders(intent, i8);
        }
    }

    /* renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0159d extends c {
        @Override // androidx.emoji2.text.d.b
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static k a(Context context) {
        return (k) new a(null).c(context);
    }
}
