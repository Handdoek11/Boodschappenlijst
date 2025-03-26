package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class g {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f10735a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f10736b = {112, 114, 109, 0};

    private static void A(byte[] bArr, int i8, int i9, c cVar) {
        int m8 = m(i8, i9, cVar.f10723g);
        int i10 = m8 / 8;
        bArr[i10] = (byte) ((1 << (m8 % 8)) | bArr[i10]);
    }

    private static void B(InputStream inputStream) {
        d.h(inputStream);
        int j8 = d.j(inputStream);
        if (j8 == 6 || j8 == 7) {
            return;
        }
        while (j8 > 0) {
            d.j(inputStream);
            for (int j9 = d.j(inputStream); j9 > 0; j9--) {
                d.h(inputStream);
            }
            j8--;
        }
    }

    static boolean C(OutputStream outputStream, byte[] bArr, c[] cVarArr) {
        if (Arrays.equals(bArr, i.f10748a)) {
            P(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f10749b)) {
            O(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f10751d)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f10750c)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, i.f10752e)) {
            return false;
        }
        L(outputStream, cVarArr);
        return true;
    }

    private static void D(OutputStream outputStream, c cVar) {
        int[] iArr = cVar.f10724h;
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            d.p(outputStream, i10 - i9);
            i8++;
            i9 = i10;
        }
    }

    private static j E(c[] cVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i8 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f10719c);
                d.q(byteArrayOutputStream, cVar.f10720d);
                d.q(byteArrayOutputStream, cVar.f10723g);
                String j8 = j(cVar.f10717a, cVar.f10718b, i.f10748a);
                int k8 = d.k(j8);
                d.p(byteArrayOutputStream, k8);
                i8 = i8 + 14 + k8;
                d.n(byteArrayOutputStream, j8);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i8 == byteArray.length) {
                j jVar = new j(e.DEX_FILES, i8, byteArray, false);
                byteArrayOutputStream.close();
                return jVar;
            }
            throw d.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void F(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f10735a);
        outputStream.write(bArr);
    }

    private static void G(OutputStream outputStream, c cVar) {
        K(outputStream, cVar);
        D(outputStream, cVar);
        I(outputStream, cVar);
    }

    private static void H(OutputStream outputStream, c cVar, String str) {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f10721e);
        d.q(outputStream, cVar.f10722f);
        d.q(outputStream, cVar.f10719c);
        d.q(outputStream, cVar.f10723g);
        d.n(outputStream, str);
    }

    private static void I(OutputStream outputStream, c cVar) {
        byte[] bArr = new byte[k(cVar.f10723g)];
        for (Map.Entry entry : cVar.f10725i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                A(bArr, 2, intValue, cVar);
            }
            if ((intValue2 & 4) != 0) {
                A(bArr, 4, intValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(OutputStream outputStream, int i8, c cVar) {
        byte[] bArr = new byte[l(i8, cVar.f10723g)];
        for (Map.Entry entry : cVar.f10725i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i9 = 0;
            for (int i10 = 1; i10 <= 4; i10 <<= 1) {
                if (i10 != 1 && (i10 & i8) != 0) {
                    if ((i10 & intValue2) == i10) {
                        int i11 = (cVar.f10723g * i9) + intValue;
                        int i12 = i11 / 8;
                        bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
                    }
                    i9++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(OutputStream outputStream, c cVar) {
        int i8 = 0;
        for (Map.Entry entry : cVar.f10725i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                d.p(outputStream, intValue - i8);
                d.p(outputStream, 0);
                i8 = intValue;
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j8 = j(cVar.f10717a, cVar.f10718b, i.f10752e);
            d.p(outputStream, d.k(j8));
            d.p(outputStream, cVar.f10725i.size());
            d.p(outputStream, cVar.f10724h.length);
            d.q(outputStream, cVar.f10719c);
            d.n(outputStream, j8);
            Iterator it = cVar.f10725i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i8 : cVar.f10724h) {
                d.p(outputStream, i8);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cVarArr) {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            int size = cVar.f10725i.size() * 4;
            String j8 = j(cVar.f10717a, cVar.f10718b, i.f10751d);
            d.p(outputStream, d.k(j8));
            d.p(outputStream, cVar.f10724h.length);
            d.q(outputStream, size);
            d.q(outputStream, cVar.f10719c);
            d.n(outputStream, j8);
            Iterator it = cVar.f10725i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, ((Integer) it.next()).intValue());
                d.p(outputStream, 0);
            }
            for (int i8 : cVar.f10724h) {
                d.p(outputStream, i8);
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cVarArr) {
        byte[] b8 = b(cVarArr, i.f10750c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b8);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) {
        byte[] b8 = b(cVarArr, i.f10749b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b8);
    }

    private static void P(OutputStream outputStream, c[] cVarArr) {
        Q(outputStream, cVarArr);
    }

    private static void Q(OutputStream outputStream, c[] cVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = i.f10748a.length + f10735a.length + 4 + (arrayList.size() * 16);
        d.q(outputStream, arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            j jVar = (j) arrayList.get(i8);
            d.q(outputStream, jVar.f10755a.c());
            d.q(outputStream, length2);
            if (jVar.f10758d) {
                byte[] bArr = jVar.f10757c;
                long length3 = bArr.length;
                byte[] b8 = d.b(bArr);
                arrayList2.add(b8);
                d.q(outputStream, b8.length);
                d.q(outputStream, length3);
                length = b8.length;
            } else {
                arrayList2.add(jVar.f10757c);
                d.q(outputStream, jVar.f10757c.length);
                d.q(outputStream, 0L);
                length = jVar.f10757c.length;
            }
            length2 += length;
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            outputStream.write((byte[]) arrayList2.get(i9));
        }
    }

    private static int a(c cVar) {
        Iterator it = cVar.f10725i.entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i8;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) {
        int i8 = 0;
        int i9 = 0;
        for (c cVar : cVarArr) {
            i9 += d.k(j(cVar.f10717a, cVar.f10718b, bArr)) + 16 + (cVar.f10721e * 2) + cVar.f10722f + k(cVar.f10723g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, i.f10750c)) {
            int length = cVarArr.length;
            while (i8 < length) {
                c cVar2 = cVarArr[i8];
                H(byteArrayOutputStream, cVar2, j(cVar2.f10717a, cVar2.f10718b, bArr));
                G(byteArrayOutputStream, cVar2);
                i8++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                H(byteArrayOutputStream, cVar3, j(cVar3.f10717a, cVar3.f10718b, bArr));
            }
            int length2 = cVarArr.length;
            while (i8 < length2) {
                G(byteArrayOutputStream, cVarArr[i8]);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    private static j c(c[] cVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < cVarArr.length; i9++) {
            try {
                c cVar = cVarArr[i9];
                d.p(byteArrayOutputStream, i9);
                d.p(byteArrayOutputStream, cVar.f10721e);
                i8 = i8 + 4 + (cVar.f10721e * 2);
                D(byteArrayOutputStream, cVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            j jVar = new j(e.CLASSES, i8, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static j d(c[] cVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < cVarArr.length; i9++) {
            try {
                c cVar = cVarArr[i9];
                int a8 = a(cVar);
                byte[] e8 = e(a8, cVar);
                byte[] f8 = f(cVar);
                d.p(byteArrayOutputStream, i9);
                int length = e8.length + 2 + f8.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, a8);
                byteArrayOutputStream.write(e8);
                byteArrayOutputStream.write(f8);
                i8 = i8 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            j jVar = new j(e.METHODS, i8, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(int i8, c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i8, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String h8 = h(str);
        for (int i8 = 0; i8 < cVarArr.length; i8++) {
            if (cVarArr[i8].f10718b.equals(h8)) {
                return cVarArr[i8];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a8 = i.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a8);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a8);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + i.a(bArr) + str2;
    }

    private static int k(int i8) {
        return z(i8 * 2) / 8;
    }

    private static int l(int i8, int i9) {
        return z(Integer.bitCount(i8 & (-2)) * i9) / 8;
    }

    private static int m(int i8, int i9, int i10) {
        if (i8 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        }
        if (i8 == 2) {
            return i9;
        }
        if (i8 == 4) {
            return i9 + i10;
        }
        throw d.c("Unexpected flag: " + i8);
    }

    private static int[] n(InputStream inputStream, int i8) {
        int[] iArr = new int[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += d.h(inputStream);
            iArr[i10] = i9;
        }
        return iArr;
    }

    private static int o(BitSet bitSet, int i8, int i9) {
        int i10 = bitSet.get(m(2, i8, i9)) ? 2 : 0;
        return bitSet.get(m(4, i8, i9)) ? i10 | 4 : i10;
    }

    static byte[] p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, i.f10749b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void q(InputStream inputStream, c cVar) {
        int available = inputStream.available() - cVar.f10722f;
        int i8 = 0;
        while (inputStream.available() > available) {
            i8 += d.h(inputStream);
            cVar.f10725i.put(Integer.valueOf(i8), 1);
            for (int h8 = d.h(inputStream); h8 > 0; h8--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        if (Arrays.equals(bArr, i.f10753f)) {
            if (Arrays.equals(i.f10748a, bArr2)) {
                throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, i.f10754g)) {
            return u(inputStream, bArr2, cVarArr);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] s(InputStream inputStream, byte[] bArr, c[] cVarArr) {
        if (!Arrays.equals(bArr, i.f10753f)) {
            throw d.c("Unsupported meta version");
        }
        int j8 = d.j(inputStream);
        byte[] e8 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e8);
        try {
            c[] t7 = t(byteArrayInputStream, j8, cVarArr);
            byteArrayInputStream.close();
            return t7;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] t(InputStream inputStream, int i8, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i8 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i8];
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int h8 = d.h(inputStream);
            iArr[i9] = d.h(inputStream);
            strArr[i9] = d.f(inputStream, h8);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            c cVar = cVarArr[i10];
            if (!cVar.f10718b.equals(strArr[i10])) {
                throw d.c("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            cVar.f10721e = i11;
            cVar.f10724h = n(inputStream, i11);
        }
        return cVarArr;
    }

    static c[] u(InputStream inputStream, byte[] bArr, c[] cVarArr) {
        int h8 = d.h(inputStream);
        byte[] e8 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e8);
        try {
            c[] v7 = v(byteArrayInputStream, bArr, h8, cVarArr);
            byteArrayInputStream.close();
            return v7;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] v(InputStream inputStream, byte[] bArr, int i8, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i8 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            d.h(inputStream);
            String f8 = d.f(inputStream, d.h(inputStream));
            long i10 = d.i(inputStream);
            int h8 = d.h(inputStream);
            c i11 = i(cVarArr, f8);
            if (i11 == null) {
                throw d.c("Missing profile key: " + f8);
            }
            i11.f10720d = i10;
            int[] n8 = n(inputStream, h8);
            if (Arrays.equals(bArr, i.f10752e)) {
                i11.f10721e = h8;
                i11.f10724h = n8;
            }
        }
        return cVarArr;
    }

    private static void w(InputStream inputStream, c cVar) {
        BitSet valueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f10723g * 2)));
        int i8 = 0;
        while (true) {
            int i9 = cVar.f10723g;
            if (i8 >= i9) {
                return;
            }
            int o8 = o(valueOf, i8, i9);
            if (o8 != 0) {
                Integer num = (Integer) cVar.f10725i.get(Integer.valueOf(i8));
                if (num == null) {
                    num = 0;
                }
                cVar.f10725i.put(Integer.valueOf(i8), Integer.valueOf(o8 | num.intValue()));
            }
            i8++;
        }
    }

    static c[] x(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, i.f10749b)) {
            throw d.c("Unsupported version");
        }
        int j8 = d.j(inputStream);
        byte[] e8 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e8);
        try {
            c[] y7 = y(byteArrayInputStream, str, j8);
            byteArrayInputStream.close();
            return y7;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] y(InputStream inputStream, String str, int i8) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int h8 = d.h(inputStream);
            int h9 = d.h(inputStream);
            cVarArr[i9] = new c(str, d.f(inputStream, h8), d.i(inputStream), 0L, h9, (int) d.i(inputStream), (int) d.i(inputStream), new int[h9], new TreeMap());
        }
        for (int i10 = 0; i10 < i8; i10++) {
            c cVar = cVarArr[i10];
            q(inputStream, cVar);
            cVar.f10724h = n(inputStream, cVar.f10721e);
            w(inputStream, cVar);
        }
        return cVarArr;
    }

    private static int z(int i8) {
        return (i8 + 7) & (-8);
    }
}
