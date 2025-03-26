package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4896e;
import com.google.android.gms.internal.measurement.C4901e4;
import com.google.android.gms.internal.measurement.C4917g2;
import com.google.android.gms.internal.measurement.C4922g7;
import com.google.android.gms.internal.measurement.C4931h7;
import com.google.android.gms.internal.measurement.C4935i2;
import com.google.android.gms.internal.measurement.C4944j2;
import com.google.android.gms.internal.measurement.C4953k2;
import com.google.android.gms.internal.measurement.C4961l2;
import com.google.android.gms.internal.measurement.C4977n2;
import com.google.android.gms.internal.measurement.C4993p2;
import com.google.android.gms.internal.measurement.C5001q2;
import com.google.android.gms.internal.measurement.C5016s2;
import com.google.android.gms.internal.measurement.C5024t2;
import com.google.android.gms.internal.measurement.C5032u2;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.n7;
import f3.InterfaceC5781e;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class Z5 extends E5 {
    Z5(H5 h52) {
        super(h52);
    }

    private final Bundle A(Map map, boolean z7) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z7) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    arrayList2.add(A((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    static C4977n2 D(C4961l2 c4961l2, String str) {
        for (C4977n2 c4977n2 : c4961l2.V()) {
            if (c4977n2.W().equals(str)) {
                return c4977n2;
            }
        }
        return null;
    }

    static com.google.android.gms.internal.measurement.V4 E(com.google.android.gms.internal.measurement.V4 v42, byte[] bArr) {
        C4901e4 a8 = C4901e4.a();
        return a8 != null ? v42.o(bArr, a8) : v42.a(bArr);
    }

    static Object H(C4961l2 c4961l2, String str, Object obj) {
        Object d02 = d0(c4961l2, str);
        return d02 == null ? obj : d02;
    }

    private static String L(boolean z7, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z8) {
            sb.append("Sequence ");
        }
        if (z9) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            long j8 = 0;
            for (int i9 = 0; i9 < 64; i9++) {
                int i10 = (i8 << 6) + i9;
                if (i10 < bitSet.length()) {
                    if (bitSet.get(i10)) {
                        j8 |= 1 << i9;
                    }
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    private static void P(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void Q(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                P(builder, str3, string, set);
            }
        }
    }

    static void R(C4961l2.a aVar, String str, Object obj) {
        List N7 = aVar.N();
        int i8 = 0;
        while (true) {
            if (i8 >= N7.size()) {
                i8 = -1;
                break;
            } else if (str.equals(((C4977n2) N7.get(i8)).W())) {
                break;
            } else {
                i8++;
            }
        }
        C4977n2.a D7 = C4977n2.U().D(str);
        if (obj instanceof Long) {
            D7.A(((Long) obj).longValue());
        } else if (obj instanceof String) {
            D7.F((String) obj);
        } else if (obj instanceof Double) {
            D7.z(((Double) obj).doubleValue());
        }
        if (i8 >= 0) {
            aVar.A(i8, D7);
        } else {
            aVar.D(D7);
        }
    }

    private static void U(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("  ");
        }
    }

    private final void V(StringBuilder sb, int i8, com.google.android.gms.internal.measurement.L1 l12) {
        if (l12 == null) {
            return;
        }
        U(sb, i8);
        sb.append("filter {\n");
        if (l12.N()) {
            Y(sb, i8, "complement", Boolean.valueOf(l12.M()));
        }
        if (l12.P()) {
            Y(sb, i8, "param_name", e().f(l12.L()));
        }
        if (l12.Q()) {
            int i9 = i8 + 1;
            com.google.android.gms.internal.measurement.O1 K7 = l12.K();
            if (K7 != null) {
                U(sb, i9);
                sb.append("string_filter");
                sb.append(" {\n");
                if (K7.O()) {
                    Y(sb, i9, "match_type", K7.G().name());
                }
                if (K7.N()) {
                    Y(sb, i9, "expression", K7.J());
                }
                if (K7.M()) {
                    Y(sb, i9, "case_sensitive", Boolean.valueOf(K7.L()));
                }
                if (K7.k() > 0) {
                    U(sb, i8 + 2);
                    sb.append("expression_list {\n");
                    for (String str : K7.K()) {
                        U(sb, i8 + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                U(sb, i9);
                sb.append("}\n");
            }
        }
        if (l12.O()) {
            W(sb, i8 + 1, "number_filter", l12.J());
        }
        U(sb, i8);
        sb.append("}\n");
    }

    private static void W(StringBuilder sb, int i8, String str, com.google.android.gms.internal.measurement.M1 m12) {
        if (m12 == null) {
            return;
        }
        U(sb, i8);
        sb.append(str);
        sb.append(" {\n");
        if (m12.N()) {
            Y(sb, i8, "comparison_type", m12.G().name());
        }
        if (m12.P()) {
            Y(sb, i8, "match_as_float", Boolean.valueOf(m12.M()));
        }
        if (m12.O()) {
            Y(sb, i8, "comparison_value", m12.J());
        }
        if (m12.R()) {
            Y(sb, i8, "min_comparison_value", m12.L());
        }
        if (m12.Q()) {
            Y(sb, i8, "max_comparison_value", m12.K());
        }
        U(sb, i8);
        sb.append("}\n");
    }

    private static void X(StringBuilder sb, int i8, String str, C5016s2 c5016s2) {
        if (c5016s2 == null) {
            return;
        }
        U(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c5016s2.I() != 0) {
            U(sb, 4);
            sb.append("results: ");
            int i9 = 0;
            for (Long l8 : c5016s2.V()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i9 = i10;
            }
            sb.append('\n');
        }
        if (c5016s2.O() != 0) {
            U(sb, 4);
            sb.append("status: ");
            int i11 = 0;
            for (Long l9 : c5016s2.X()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l9);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (c5016s2.k() != 0) {
            U(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (C4953k2 c4953k2 : c5016s2.U()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                sb.append(c4953k2.M() ? Integer.valueOf(c4953k2.k()) : null);
                sb.append(":");
                sb.append(c4953k2.L() ? Long.valueOf(c4953k2.I()) : null);
                i13 = i14;
            }
            sb.append("}\n");
        }
        if (c5016s2.L() != 0) {
            U(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (C5024t2 c5024t2 : c5016s2.W()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                sb.append(c5024t2.N() ? Integer.valueOf(c5024t2.J()) : null);
                sb.append(": [");
                Iterator it = c5024t2.M().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i17 = i18;
                }
                sb.append("]");
                i15 = i16;
            }
            sb.append("}\n");
        }
        U(sb, 3);
        sb.append("}\n");
    }

    private static void Y(StringBuilder sb, int i8, String str, Object obj) {
        if (obj == null) {
            return;
        }
        U(sb, i8 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void Z(StringBuilder sb, int i8, List list) {
        if (list == null) {
            return;
        }
        int i9 = i8 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4977n2 c4977n2 = (C4977n2) it.next();
            if (c4977n2 != null) {
                U(sb, i9);
                sb.append("param {\n");
                Y(sb, i9, "name", c4977n2.c0() ? e().f(c4977n2.W()) : null);
                Y(sb, i9, "string_value", c4977n2.d0() ? c4977n2.X() : null);
                Y(sb, i9, "int_value", c4977n2.b0() ? Long.valueOf(c4977n2.S()) : null);
                Y(sb, i9, "double_value", c4977n2.Z() ? Double.valueOf(c4977n2.G()) : null);
                if (c4977n2.Q() > 0) {
                    Z(sb, i9, c4977n2.Y());
                }
                U(sb, i9);
                sb.append("}\n");
            }
        }
    }

    static boolean b0(E e8, M5 m52) {
        Z2.r.l(e8);
        Z2.r.l(m52);
        return (TextUtils.isEmpty(m52.f30615s) && TextUtils.isEmpty(m52.f30598H)) ? false : true;
    }

    static boolean c0(List list, int i8) {
        if (i8 < (list.size() << 6)) {
            return ((1 << (i8 % 64)) & ((Long) list.get(i8 / 64)).longValue()) != 0;
        }
        return false;
    }

    static Object d0(C4961l2 c4961l2, String str) {
        C4977n2 D7 = D(c4961l2, str);
        if (D7 == null) {
            return null;
        }
        if (D7.d0()) {
            return D7.X();
        }
        if (D7.b0()) {
            return Long.valueOf(D7.S());
        }
        if (D7.Z()) {
            return Double.valueOf(D7.G());
        }
        if (D7.Q() > 0) {
            return g0(D7.Y());
        }
        return null;
    }

    static boolean e0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static Bundle[] g0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4977n2 c4977n2 = (C4977n2) it.next();
            if (c4977n2 != null) {
                Bundle bundle = new Bundle();
                for (C4977n2 c4977n22 : c4977n2.Y()) {
                    if (c4977n22.d0()) {
                        bundle.putString(c4977n22.W(), c4977n22.X());
                    } else if (c4977n22.b0()) {
                        bundle.putLong(c4977n22.W(), c4977n22.S());
                    } else if (c4977n22.Z()) {
                        bundle.putDouble(c4977n22.W(), c4977n22.G());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int w(C5001q2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i8 = 0; i8 < aVar.e0(); i8++) {
            if (str.equals(aVar.M0(i8).U())) {
                return i8;
            }
        }
        return -1;
    }

    static Bundle z(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4977n2 c4977n2 = (C4977n2) it.next();
            String W7 = c4977n2.W();
            if (c4977n2.Z()) {
                bundle.putDouble(W7, c4977n2.G());
            } else if (c4977n2.a0()) {
                bundle.putFloat(W7, c4977n2.N());
            } else if (c4977n2.d0()) {
                bundle.putString(W7, c4977n2.X());
            } else if (c4977n2.b0()) {
                bundle.putLong(W7, c4977n2.S());
            }
        }
        return bundle;
    }

    final Parcelable B(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            h().E().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    final C4961l2 C(B b8) {
        C4961l2.a C7 = C4961l2.S().C(b8.f30286e);
        Iterator it = b8.f30287f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4977n2.a D7 = C4977n2.U().D(str);
            Object F02 = b8.f30287f.F0(str);
            Z2.r.l(F02);
            S(D7, F02);
            C7.D(D7);
        }
        if (a().r(G.f30451j1) && !TextUtils.isEmpty(b8.f30284c) && b8.f30287f.F0("_o") == null) {
            C7.E((C4977n2) ((AbstractC5010r4) C4977n2.U().D("_o").F(b8.f30284c).u()));
        }
        return (C4961l2) ((AbstractC5010r4) C7.u());
    }

    final E F(C4896e c4896e) {
        Object obj;
        Bundle A7 = A(c4896e.g(), true);
        String obj2 = (!A7.containsKey("_o") || (obj = A7.get("_o")) == null) ? "app" : obj.toString();
        String b8 = w3.q.b(c4896e.e());
        if (b8 == null) {
            b8 = c4896e.e();
        }
        return new E(b8, new D(A7), obj2, c4896e.a());
    }

    final B5 G(String str, C5001q2.a aVar, C4961l2.a aVar2, String str2) {
        int indexOf;
        if (!C4922g7.a() || !a().D(str, G.f30387I0)) {
            return null;
        }
        long a8 = zzb().a();
        String[] split = a().B(str, G.f30444h0).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        G5 r8 = r();
        String P7 = r8.p().P(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(r8.a().B(str, G.f30423a0));
        if (TextUtils.isEmpty(P7)) {
            builder.authority(r8.a().B(str, G.f30426b0));
        } else {
            builder.authority(P7 + "." + r8.a().B(str, G.f30426b0));
        }
        builder.path(r8.a().B(str, G.f30429c0));
        P(builder, "gmp_app_id", aVar.i1(), unmodifiableSet);
        P(builder, "gmp_version", "106000", unmodifiableSet);
        String f12 = aVar.f1();
        C5326g a9 = a();
        C5294b2 c5294b2 = G.f30393L0;
        if (a9.D(str, c5294b2) && p().Y(str)) {
            f12 = "";
        }
        P(builder, "app_instance_id", f12, unmodifiableSet);
        P(builder, "rdid", aVar.k1(), unmodifiableSet);
        P(builder, "bundle_id", aVar.e1(), unmodifiableSet);
        String M7 = aVar2.M();
        String a10 = w3.q.a(M7);
        if (!TextUtils.isEmpty(a10)) {
            M7 = a10;
        }
        P(builder, "app_event_name", M7, unmodifiableSet);
        P(builder, "app_version", String.valueOf(aVar.S()), unmodifiableSet);
        String j12 = aVar.j1();
        if (a().D(str, c5294b2) && p().c0(str) && !TextUtils.isEmpty(j12) && (indexOf = j12.indexOf(".")) != -1) {
            j12 = j12.substring(0, indexOf);
        }
        P(builder, "os_version", j12, unmodifiableSet);
        P(builder, "timestamp", String.valueOf(aVar2.K()), unmodifiableSet);
        if (aVar.Q()) {
            P(builder, "lat", "1", unmodifiableSet);
        }
        P(builder, "privacy_sandbox_version", String.valueOf(aVar.y()), unmodifiableSet);
        P(builder, "trigger_uri_source", "1", unmodifiableSet);
        P(builder, "trigger_uri_timestamp", String.valueOf(a8), unmodifiableSet);
        P(builder, "request_uuid", str2, unmodifiableSet);
        List<C4977n2> N7 = aVar2.N();
        Bundle bundle = new Bundle();
        for (C4977n2 c4977n2 : N7) {
            String W7 = c4977n2.W();
            if (c4977n2.Z()) {
                bundle.putString(W7, String.valueOf(c4977n2.G()));
            } else if (c4977n2.a0()) {
                bundle.putString(W7, String.valueOf(c4977n2.N()));
            } else if (c4977n2.d0()) {
                bundle.putString(W7, c4977n2.X());
            } else if (c4977n2.b0()) {
                bundle.putString(W7, String.valueOf(c4977n2.S()));
            }
        }
        Q(builder, a().B(str, G.f30441g0).split("\\|"), bundle, unmodifiableSet);
        List<C5032u2> O7 = aVar.O();
        Bundle bundle2 = new Bundle();
        for (C5032u2 c5032u2 : O7) {
            String U7 = c5032u2.U();
            if (c5032u2.W()) {
                bundle2.putString(U7, String.valueOf(c5032u2.G()));
            } else if (c5032u2.X()) {
                bundle2.putString(U7, String.valueOf(c5032u2.L()));
            } else if (c5032u2.a0()) {
                bundle2.putString(U7, c5032u2.V());
            } else if (c5032u2.Y()) {
                bundle2.putString(U7, String.valueOf(c5032u2.P()));
            }
        }
        Q(builder, a().B(str, G.f30438f0).split("\\|"), bundle2, unmodifiableSet);
        P(builder, "dma", aVar.P() ? "1" : "0", unmodifiableSet);
        if (!aVar.h1().isEmpty()) {
            P(builder, "dma_cps", aVar.h1(), unmodifiableSet);
        }
        if (a().r(G.f30397N0) && aVar.R()) {
            C4917g2 t02 = aVar.t0();
            if (!t02.b0().isEmpty()) {
                P(builder, "dl_gclid", t02.b0(), unmodifiableSet);
            }
            if (!t02.a0().isEmpty()) {
                P(builder, "dl_gbraid", t02.a0(), unmodifiableSet);
            }
            if (!t02.X().isEmpty()) {
                P(builder, "dl_gs", t02.X(), unmodifiableSet);
            }
            if (t02.G() > 0) {
                P(builder, "dl_ss_ts", String.valueOf(t02.G()), unmodifiableSet);
            }
            if (!t02.e0().isEmpty()) {
                P(builder, "mr_gclid", t02.e0(), unmodifiableSet);
            }
            if (!t02.d0().isEmpty()) {
                P(builder, "mr_gbraid", t02.d0(), unmodifiableSet);
            }
            if (!t02.c0().isEmpty()) {
                P(builder, "mr_gs", t02.c0(), unmodifiableSet);
            }
            if (t02.K() > 0) {
                P(builder, "mr_click_ts", String.valueOf(t02.K()), unmodifiableSet);
            }
        }
        return new B5(builder.build().toString(), a8, 1);
    }

    final String I(com.google.android.gms.internal.measurement.K1 k12) {
        if (k12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (k12.T()) {
            Y(sb, 0, "filter_id", Integer.valueOf(k12.J()));
        }
        Y(sb, 0, "event_name", e().c(k12.N()));
        String L7 = L(k12.P(), k12.Q(), k12.R());
        if (!L7.isEmpty()) {
            Y(sb, 0, "filter_type", L7);
        }
        if (k12.S()) {
            W(sb, 1, "event_count_filter", k12.M());
        }
        if (k12.k() > 0) {
            sb.append("  filters {\n");
            Iterator it = k12.O().iterator();
            while (it.hasNext()) {
                V(sb, 2, (com.google.android.gms.internal.measurement.L1) it.next());
            }
        }
        U(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String J(com.google.android.gms.internal.measurement.N1 n12) {
        if (n12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (n12.O()) {
            Y(sb, 0, "filter_id", Integer.valueOf(n12.k()));
        }
        Y(sb, 0, "property_name", e().g(n12.K()));
        String L7 = L(n12.L(), n12.M(), n12.N());
        if (!L7.isEmpty()) {
            Y(sb, 0, "filter_type", L7);
        }
        V(sb, 1, n12.H());
        sb.append("}\n");
        return sb.toString();
    }

    final String K(C4993p2 c4993p2) {
        C4935i2 t22;
        if (c4993p2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (n7.a() && a().r(G.f30484y0) && c4993p2.k() > 0) {
            g();
            if (d6.F0(c4993p2.H(0).x2())) {
                if (c4993p2.T()) {
                    Y(sb, 0, "upload_subdomain", c4993p2.Q());
                }
                if (c4993p2.S()) {
                    Y(sb, 0, "sgtm_join_id", c4993p2.P());
                }
            }
        }
        for (C5001q2 c5001q2 : c4993p2.R()) {
            if (c5001q2 != null) {
                U(sb, 1);
                sb.append("bundle {\n");
                if (c5001q2.R0()) {
                    Y(sb, 1, "protocol_version", Integer.valueOf(c5001q2.w1()));
                }
                if (C4931h7.a() && a().D(c5001q2.x2(), G.f30482x0) && c5001q2.U0()) {
                    Y(sb, 1, "session_stitching_token", c5001q2.i0());
                }
                Y(sb, 1, "platform", c5001q2.g0());
                if (c5001q2.M0()) {
                    Y(sb, 1, "gmp_version", Long.valueOf(c5001q2.f2()));
                }
                if (c5001q2.Z0()) {
                    Y(sb, 1, "uploading_gmp_version", Long.valueOf(c5001q2.r2()));
                }
                if (c5001q2.K0()) {
                    Y(sb, 1, "dynamite_version", Long.valueOf(c5001q2.Y1()));
                }
                if (c5001q2.D0()) {
                    Y(sb, 1, "config_version", Long.valueOf(c5001q2.Q1()));
                }
                Y(sb, 1, "gmp_app_id", c5001q2.d0());
                Y(sb, 1, "admob_app_id", c5001q2.w2());
                Y(sb, 1, "app_id", c5001q2.x2());
                Y(sb, 1, "app_version", c5001q2.W());
                if (c5001q2.s0()) {
                    Y(sb, 1, "app_version_major", Integer.valueOf(c5001q2.u0()));
                }
                Y(sb, 1, "firebase_instance_id", c5001q2.c0());
                if (c5001q2.I0()) {
                    Y(sb, 1, "dev_cert_hash", Long.valueOf(c5001q2.U1()));
                }
                Y(sb, 1, "app_store", c5001q2.V());
                if (c5001q2.Y0()) {
                    Y(sb, 1, "upload_timestamp_millis", Long.valueOf(c5001q2.p2()));
                }
                if (c5001q2.V0()) {
                    Y(sb, 1, "start_timestamp_millis", Long.valueOf(c5001q2.l2()));
                }
                if (c5001q2.L0()) {
                    Y(sb, 1, "end_timestamp_millis", Long.valueOf(c5001q2.c2()));
                }
                if (c5001q2.Q0()) {
                    Y(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c5001q2.j2()));
                }
                if (c5001q2.P0()) {
                    Y(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c5001q2.h2()));
                }
                Y(sb, 1, "app_instance_id", c5001q2.U());
                Y(sb, 1, "resettable_device_id", c5001q2.h0());
                Y(sb, 1, "ds_id", c5001q2.b0());
                if (c5001q2.O0()) {
                    Y(sb, 1, "limited_ad_tracking", Boolean.valueOf(c5001q2.p0()));
                }
                Y(sb, 1, "os_version", c5001q2.f0());
                Y(sb, 1, "device_model", c5001q2.a0());
                Y(sb, 1, "user_default_language", c5001q2.j0());
                if (c5001q2.X0()) {
                    Y(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c5001q2.G1()));
                }
                if (c5001q2.C0()) {
                    Y(sb, 1, "bundle_sequential_index", Integer.valueOf(c5001q2.a1()));
                }
                if (n7.a()) {
                    g();
                    if (d6.F0(c5001q2.x2()) && a().r(G.f30484y0) && c5001q2.H0()) {
                        Y(sb, 1, "delivery_index", Integer.valueOf(c5001q2.j1()));
                    }
                }
                if (c5001q2.T0()) {
                    Y(sb, 1, "service_upload", Boolean.valueOf(c5001q2.q0()));
                }
                Y(sb, 1, "health_monitor", c5001q2.e0());
                if (c5001q2.S0()) {
                    Y(sb, 1, "retry_counter", Integer.valueOf(c5001q2.B1()));
                }
                if (c5001q2.F0()) {
                    Y(sb, 1, "consent_signals", c5001q2.Y());
                }
                if (c5001q2.N0()) {
                    Y(sb, 1, "is_dma_region", Boolean.valueOf(c5001q2.o0()));
                }
                if (c5001q2.G0()) {
                    Y(sb, 1, "core_platform_services", c5001q2.Z());
                }
                if (c5001q2.E0()) {
                    Y(sb, 1, "consent_diagnostics", c5001q2.X());
                }
                if (c5001q2.W0()) {
                    Y(sb, 1, "target_os_version", Long.valueOf(c5001q2.n2()));
                }
                if (C4922g7.a() && a().D(c5001q2.x2(), G.f30387I0)) {
                    Y(sb, 1, "ad_services_version", Integer.valueOf(c5001q2.k()));
                    if (c5001q2.t0() && (t22 = c5001q2.t2()) != null) {
                        U(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Y(sb, 2, "eligible", Boolean.valueOf(t22.R()));
                        Y(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(t22.U()));
                        Y(sb, 2, "pre_r", Boolean.valueOf(t22.V()));
                        Y(sb, 2, "r_extensions_too_old", Boolean.valueOf(t22.W()));
                        Y(sb, 2, "adservices_extension_too_old", Boolean.valueOf(t22.P()));
                        Y(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(t22.N()));
                        Y(sb, 2, "measurement_manager_disabled", Boolean.valueOf(t22.T()));
                        U(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (N6.a() && a().r(G.f30413V0) && c5001q2.r0()) {
                    C4917g2 s22 = c5001q2.s2();
                    U(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (s22.h0()) {
                        Y(sb, 2, "deep_link_gclid", s22.b0());
                    }
                    if (s22.g0()) {
                        Y(sb, 2, "deep_link_gbraid", s22.a0());
                    }
                    if (s22.f0()) {
                        Y(sb, 2, "deep_link_gad_source", s22.X());
                    }
                    if (s22.i0()) {
                        Y(sb, 2, "deep_link_session_millis", Long.valueOf(s22.G()));
                    }
                    if (s22.m0()) {
                        Y(sb, 2, "market_referrer_gclid", s22.e0());
                    }
                    if (s22.l0()) {
                        Y(sb, 2, "market_referrer_gbraid", s22.d0());
                    }
                    if (s22.k0()) {
                        Y(sb, 2, "market_referrer_gad_source", s22.c0());
                    }
                    if (s22.j0()) {
                        Y(sb, 2, "market_referrer_click_millis", Long.valueOf(s22.K()));
                    }
                    U(sb, 2);
                    sb.append("}\n");
                }
                List<C5032u2> m02 = c5001q2.m0();
                if (m02 != null) {
                    for (C5032u2 c5032u2 : m02) {
                        if (c5032u2 != null) {
                            U(sb, 2);
                            sb.append("user_property {\n");
                            Y(sb, 2, "set_timestamp_millis", c5032u2.Z() ? Long.valueOf(c5032u2.R()) : null);
                            Y(sb, 2, "name", e().g(c5032u2.U()));
                            Y(sb, 2, "string_value", c5032u2.V());
                            Y(sb, 2, "int_value", c5032u2.Y() ? Long.valueOf(c5032u2.P()) : null);
                            Y(sb, 2, "double_value", c5032u2.W() ? Double.valueOf(c5032u2.G()) : null);
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C4944j2> k02 = c5001q2.k0();
                c5001q2.x2();
                if (k02 != null) {
                    for (C4944j2 c4944j2 : k02) {
                        if (c4944j2 != null) {
                            U(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c4944j2.P()) {
                                Y(sb, 2, "audience_id", Integer.valueOf(c4944j2.k()));
                            }
                            if (c4944j2.Q()) {
                                Y(sb, 2, "new_audience", Boolean.valueOf(c4944j2.O()));
                            }
                            X(sb, 2, "current_data", c4944j2.M());
                            if (c4944j2.R()) {
                                X(sb, 2, "previous_data", c4944j2.N());
                            }
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C4961l2> l02 = c5001q2.l0();
                if (l02 != null) {
                    for (C4961l2 c4961l2 : l02) {
                        if (c4961l2 != null) {
                            U(sb, 2);
                            sb.append("event {\n");
                            Y(sb, 2, "name", e().c(c4961l2.U()));
                            if (c4961l2.Y()) {
                                Y(sb, 2, "timestamp_millis", Long.valueOf(c4961l2.R()));
                            }
                            if (c4961l2.X()) {
                                Y(sb, 2, "previous_timestamp_millis", Long.valueOf(c4961l2.Q()));
                            }
                            if (c4961l2.W()) {
                                Y(sb, 2, "count", Integer.valueOf(c4961l2.k()));
                            }
                            if (c4961l2.O() != 0) {
                                Z(sb, 2, c4961l2.V());
                            }
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                U(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    final List N(List list, List list2) {
        int i8;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                h().J().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    h().J().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i9 = size2;
            i8 = size;
            size = i9;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i8);
    }

    final Map O(Bundle bundle, boolean z7) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z8 = obj instanceof Parcelable[];
            if (z8 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z7) {
                    ArrayList arrayList = new ArrayList();
                    if (z8) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(O((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Object obj2 = arrayList2.get(i8);
                            i8++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(O((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(O((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    final void S(C4977n2.a aVar, Object obj) {
        Z2.r.l(obj);
        aVar.I().G().E().H();
        if (obj instanceof String) {
            aVar.F((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.A(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.z(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            h().E().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C4977n2.a U7 = C4977n2.U();
                for (String str : bundle.keySet()) {
                    C4977n2.a D7 = C4977n2.U().D(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        D7.A(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        D7.F((String) obj2);
                    } else if (obj2 instanceof Double) {
                        D7.z(((Double) obj2).doubleValue());
                    }
                    U7.B(D7);
                }
                if (U7.y() > 0) {
                    arrayList.add((C4977n2) ((AbstractC5010r4) U7.u()));
                }
            }
        }
        aVar.C(arrayList);
    }

    final void T(C5032u2.a aVar, Object obj) {
        Z2.r.l(obj);
        aVar.F().C().y();
        if (obj instanceof String) {
            aVar.E((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.z(((Double) obj).doubleValue());
        } else {
            h().E().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    final boolean a0(long j8, long j9) {
        return j8 == 0 || j9 <= 0 || Math.abs(zzb().a() - j8) > j9;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    final byte[] f0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            h().E().b("Failed to gzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    final byte[] h0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e8) {
            h().E().b("Failed to ungzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    final List i0() {
        Map e8 = G.e(this.f30369b.zza());
        if (e8 == null || e8.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) G.f30406S.a(null)).intValue();
        for (Map.Entry entry : e8.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            h().J().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e9) {
                    h().J().b("Experiment ID NumberFormatException", e9);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5354k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5353j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final long x(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return y(str.getBytes(Charset.forName("UTF-8")));
    }

    final long y(byte[] bArr) {
        Z2.r.l(bArr);
        g().l();
        MessageDigest T02 = d6.T0();
        if (T02 != null) {
            return d6.z(T02.digest(bArr));
        }
        h().E().a("Failed to get MD5");
        return 0L;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
