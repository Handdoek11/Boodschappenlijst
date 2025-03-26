package androidx.room;

import android.content.Context;
import androidx.room.h;
import g1.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0258c f11293a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11294b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11295c;

    /* renamed from: d, reason: collision with root package name */
    public final h.d f11296d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11297e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11298f;

    /* renamed from: g, reason: collision with root package name */
    public final h.c f11299g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f11300h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f11301i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11302j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11303k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11304l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f11305m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11306n;

    /* renamed from: o, reason: collision with root package name */
    public final File f11307o;

    public a(Context context, String str, c.InterfaceC0258c interfaceC0258c, h.d dVar, List list, boolean z7, h.c cVar, Executor executor, Executor executor2, boolean z8, boolean z9, boolean z10, Set set, String str2, File file) {
        this.f11293a = interfaceC0258c;
        this.f11294b = context;
        this.f11295c = str;
        this.f11296d = dVar;
        this.f11297e = list;
        this.f11298f = z7;
        this.f11299g = cVar;
        this.f11300h = executor;
        this.f11301i = executor2;
        this.f11302j = z8;
        this.f11303k = z9;
        this.f11304l = z10;
        this.f11305m = set;
        this.f11306n = str2;
        this.f11307o = file;
    }

    public boolean a(int i8, int i9) {
        if ((i8 > i9 && this.f11304l) || !this.f11303k) {
            return false;
        }
        Set set = this.f11305m;
        return set == null || !set.contains(Integer.valueOf(i8));
    }
}
