package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class M4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17214a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17215b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17216c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17217d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17218e;

    /* renamed from: f, reason: collision with root package name */
    public final S4 f17219f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f17220g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17221h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17222i;

    /* renamed from: j, reason: collision with root package name */
    public final M4 f17223j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap f17224k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap f17225l;

    /* renamed from: m, reason: collision with root package name */
    private List f17226m;

    private M4(String str, String str2, long j8, long j9, S4 s42, String[] strArr, String str3, String str4, M4 m42) {
        this.f17214a = str;
        this.f17215b = str2;
        this.f17222i = str4;
        this.f17219f = s42;
        this.f17220g = strArr;
        this.f17216c = str2 != null;
        this.f17217d = j8;
        this.f17218e = j9;
        str3.getClass();
        this.f17221h = str3;
        this.f17223j = m42;
        this.f17224k = new HashMap();
        this.f17225l = new HashMap();
    }

    public static M4 b(String str, long j8, long j9, S4 s42, String[] strArr, String str2, String str3, M4 m42) {
        return new M4(str, null, j8, j9, s42, strArr, str2, str3, m42);
    }

    public static M4 c(String str) {
        return new M4(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            C2677fx c2677fx = new C2677fx();
            c2677fx.l(new SpannableStringBuilder());
            map.put(str, c2677fx);
        }
        CharSequence q8 = ((C2677fx) map.get(str)).q();
        q8.getClass();
        return (SpannableStringBuilder) q8;
    }

    private final void j(TreeSet treeSet, boolean z7) {
        String str = this.f17214a;
        boolean equals = AdActionType.POPUP.equals(str);
        boolean equals2 = "div".equals(str);
        if (z7 || equals || (equals2 && this.f17222i != null)) {
            long j8 = this.f17217d;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
            long j9 = this.f17218e;
            if (j9 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j9));
            }
        }
        if (this.f17226m != null) {
            for (int i8 = 0; i8 < this.f17226m.size(); i8++) {
                M4 m42 = (M4) this.f17226m.get(i8);
                boolean z8 = true;
                if (!z7 && !equals) {
                    z8 = false;
                }
                m42.j(treeSet, z8);
            }
        }
    }

    private final void k(long j8, String str, List list) {
        String str2;
        if (!"".equals(this.f17221h)) {
            str = this.f17221h;
        }
        if (g(j8) && "div".equals(this.f17214a) && (str2 = this.f17222i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i8 = 0; i8 < a(); i8++) {
            d(i8).k(j8, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M4.l(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    private final void m(long j8, boolean z7, String str, Map map) {
        this.f17224k.clear();
        this.f17225l.clear();
        if ("metadata".equals(this.f17214a)) {
            return;
        }
        if (!"".equals(this.f17221h)) {
            str = this.f17221h;
        }
        if (this.f17216c && z7) {
            SpannableStringBuilder i8 = i(str, map);
            String str2 = this.f17215b;
            str2.getClass();
            i8.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f17214a) && z7) {
            i(str, map).append('\n');
            return;
        }
        if (g(j8)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap = this.f17224k;
                String str3 = (String) entry.getKey();
                CharSequence q8 = ((C2677fx) entry.getValue()).q();
                q8.getClass();
                hashMap.put(str3, Integer.valueOf(q8.length()));
            }
            boolean equals = AdActionType.POPUP.equals(this.f17214a);
            for (int i9 = 0; i9 < a(); i9++) {
                d(i9).m(j8, z7 || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder i10 = i(str, map);
                int length = i10.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (i10.charAt(length) == ' ');
                if (length >= 0 && i10.charAt(length) != '\n') {
                    i10.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap hashMap2 = this.f17225l;
                String str4 = (String) entry2.getKey();
                CharSequence q9 = ((C2677fx) entry2.getValue()).q();
                q9.getClass();
                hashMap2.put(str4, Integer.valueOf(q9.length()));
            }
        }
    }

    public final int a() {
        List list = this.f17226m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final M4 d(int i8) {
        List list = this.f17226m;
        if (list != null) {
            return (M4) list.get(i8);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List e(long j8, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        k(j8, this.f17221h, arrayList);
        TreeMap treeMap = new TreeMap();
        m(j8, false, this.f17221h, treeMap);
        l(j8, map, map2, this.f17221h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Pair pair = (Pair) arrayList.get(i8);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                Q4 q42 = (Q4) map2.get(pair.first);
                q42.getClass();
                C2677fx c2677fx = new C2677fx();
                c2677fx.c(decodeByteArray);
                c2677fx.h(q42.f18360b);
                c2677fx.i(0);
                c2677fx.e(q42.f18361c, 0);
                c2677fx.f(q42.f18363e);
                c2677fx.k(q42.f18364f);
                c2677fx.d(q42.f18365g);
                c2677fx.o(q42.f18368j);
                arrayList2.add(c2677fx.p());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Q4 q43 = (Q4) map2.get(entry.getKey());
            q43.getClass();
            C2677fx c2677fx2 = (C2677fx) entry.getValue();
            CharSequence q8 = c2677fx2.q();
            q8.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) q8;
            for (K4 k42 : (K4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), K4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(k42), spannableStringBuilder.getSpanEnd(k42), (CharSequence) "");
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length()) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i9, i12 + i9);
                    }
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i13 = 0;
            while (i13 < spannableStringBuilder.length() - 1) {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i13) == '\n' && spannableStringBuilder.charAt(i14) == ' ') {
                    spannableStringBuilder.delete(i14, i13 + 2);
                }
                i13 = i14;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ' && spannableStringBuilder.charAt(i16) == '\n') {
                    spannableStringBuilder.delete(i15, i16);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c2677fx2.e(q43.f18361c, q43.f18362d);
            c2677fx2.f(q43.f18363e);
            c2677fx2.h(q43.f18360b);
            c2677fx2.k(q43.f18364f);
            c2677fx2.n(q43.f18367i, q43.f18366h);
            c2677fx2.o(q43.f18368j);
            arrayList2.add(c2677fx2.p());
        }
        return arrayList2;
    }

    public final void f(M4 m42) {
        if (this.f17226m == null) {
            this.f17226m = new ArrayList();
        }
        this.f17226m.add(m42);
    }

    public final boolean g(long j8) {
        long j9 = this.f17217d;
        if (j9 == -9223372036854775807L) {
            if (this.f17218e == -9223372036854775807L) {
                return true;
            }
            j9 = -9223372036854775807L;
        }
        if (j9 <= j8 && this.f17218e == -9223372036854775807L) {
            return true;
        }
        if (j9 != -9223372036854775807L || j8 >= this.f17218e) {
            return j9 <= j8 && j8 < this.f17218e;
        }
        return true;
    }

    public final long[] h() {
        TreeSet treeSet = new TreeSet();
        int i8 = 0;
        j(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i8] = ((Long) it.next()).longValue();
            i8++;
        }
        return jArr;
    }
}
