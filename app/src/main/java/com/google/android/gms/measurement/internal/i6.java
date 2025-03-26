package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    private final S2 f30998a;

    public i6(S2 s22) {
        this.f30998a = s22;
    }

    private final boolean d() {
        return this.f30998a.D().f31307z.a() > 0;
    }

    private final boolean e() {
        return d() && this.f30998a.zzb().a() - this.f30998a.D().f31307z.a() > this.f30998a.x().y(null, G.f30414W);
    }

    final void a() {
        this.f30998a.j().l();
        if (d()) {
            if (e()) {
                this.f30998a.D().f31306y.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f30998a.F().Z0("auto", "_cmpx", bundle);
            } else {
                String a8 = this.f30998a.D().f31306y.a();
                if (TextUtils.isEmpty(a8)) {
                    this.f30998a.h().G().a("Cache still valid but referrer not found");
                } else {
                    long a9 = ((this.f30998a.D().f31307z.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a8);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a9);
                    Object obj = pair.first;
                    this.f30998a.F().Z0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f30998a.D().f31306y.b(null);
            }
            this.f30998a.D().f31307z.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String str2;
        this.f30998a.j().l();
        if (this.f30998a.n()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f30998a.D().f31306y.b(str2);
        this.f30998a.D().f31307z.b(this.f30998a.zzb().a());
    }

    final void c() {
        if (d() && e()) {
            this.f30998a.D().f31306y.b(null);
        }
    }
}
