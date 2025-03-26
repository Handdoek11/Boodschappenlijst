package D2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: D2.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498e1 {

    /* renamed from: g, reason: collision with root package name */
    private String f1238g;

    /* renamed from: i, reason: collision with root package name */
    private String f1240i;

    /* renamed from: j, reason: collision with root package name */
    private String f1241j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1243l;

    /* renamed from: m, reason: collision with root package name */
    private String f1244m;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f1232a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f1233b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f1234c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f1235d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f1236e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f1237f = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final List f1239h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f1242k = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f1245n = 60000;

    public final void a(boolean z7) {
        this.f1242k = z7 ? 1 : 0;
    }

    public final void p(String str, String str2) {
        this.f1236e.putString(str, str2);
    }

    public final void q(String str) {
        this.f1232a.add(str);
    }

    public final void r(Class cls, Bundle bundle) {
        this.f1233b.putBundle(cls.getName(), bundle);
    }

    public final void s(String str) {
        this.f1235d.add(str);
    }

    public final void t(String str) {
        this.f1235d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void u(boolean z7) {
        this.f1243l = z7;
    }
}
