package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: x, reason: collision with root package name */
    private Context f23019x;

    /* renamed from: o, reason: collision with root package name */
    private final Object f23013o = new Object();

    /* renamed from: s, reason: collision with root package name */
    private final ConditionVariable f23014s = new ConditionVariable();

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f23015t = false;

    /* renamed from: u, reason: collision with root package name */
    volatile boolean f23016u = false;

    /* renamed from: v, reason: collision with root package name */
    private SharedPreferences f23017v = null;

    /* renamed from: w, reason: collision with root package name */
    private Bundle f23018w = new Bundle();

    /* renamed from: y, reason: collision with root package name */
    private JSONObject f23020y = new JSONObject();

    /* renamed from: z, reason: collision with root package name */
    private boolean f23021z = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f23012A = false;

    private final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f23020y = new JSONObject((String) AbstractC3402mf.a(new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.ff
                @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object a(final AbstractC2207bf abstractC2207bf) {
        if (!this.f23014s.block(5000L)) {
            synchronized (this.f23013o) {
                try {
                    if (!this.f23016u) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f23015t || this.f23017v == null || this.f23012A) {
            synchronized (this.f23013o) {
                if (this.f23015t && this.f23017v != null && !this.f23012A) {
                }
                return abstractC2207bf.k();
            }
        }
        if (abstractC2207bf.e() != 2) {
            return (abstractC2207bf.e() == 1 && this.f23020y.has(abstractC2207bf.l())) ? abstractC2207bf.a(this.f23020y) : AbstractC3402mf.a(new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.gf
                @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
                public final Object zza() {
                    return this.f22412o.c(abstractC2207bf);
                }
            });
        }
        Bundle bundle = this.f23018w;
        return bundle == null ? abstractC2207bf.k() : abstractC2207bf.b(bundle);
    }

    public final Object b(AbstractC2207bf abstractC2207bf) {
        return (this.f23015t || this.f23016u) ? a(abstractC2207bf) : abstractC2207bf.k();
    }

    final /* synthetic */ Object c(AbstractC2207bf abstractC2207bf) {
        return abstractC2207bf.c(this.f23017v);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0120 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:7:0x0008, B:9:0x000c, B:13:0x0011, B:15:0x0016, B:16:0x0018, B:18:0x002a, B:19:0x002e, B:20:0x0030, B:42:0x009e, B:43:0x00a5, B:52:0x00d4, B:53:0x00db, B:67:0x0120, B:68:0x0127, B:76:0x014e, B:77:0x0155, B:79:0x0157, B:80:0x015e, B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:70:0x0129, B:72:0x0140, B:74:0x0144, B:75:0x0147, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:88:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129 A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:70:0x0129, B:72:0x0140, B:74:0x0144, B:75:0x0147, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:85:0x0045, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Cif.d(android.content.Context):void");
    }

    public final boolean e() {
        return this.f23012A;
    }

    final boolean f() {
        return this.f23021z;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
