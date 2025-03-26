package com.headcode.ourgroceries.android;

import android.content.Context;
import com.headcode.ourgroceries.android.U;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4SafeDecompressor;
import net.jpountz.xxhash.XXHashFactory;
import q5.AbstractC6635a;
import s5.C6736b;
import s5.C6737c;
import s5.C6738d;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class T {

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f34482c = new Comparator() { // from class: com.headcode.ourgroceries.android.S
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T.e((C6736b) obj, (C6736b) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f34483a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f34484b;

    public T(Context context) {
        this.f34483a = context;
        this.f34484b = f(context);
    }

    private static String c(String str, Map map, Locale locale) {
        String d8 = AbstractC6803e.d(str, locale);
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (d8.equals(AbstractC6803e.d((String) entry.getValue(), locale))) {
                return str2;
            }
        }
        return null;
    }

    private static int d(String str, int i8) {
        XXHashFactory fastestJavaInstance = XXHashFactory.fastestJavaInstance();
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return Q.a(fastestJavaInstance.hash32().hash(bytes, 0, bytes.length, 0), i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(C6736b c6736b, C6736b c6736b2) {
        String q8 = c6736b.q();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = q8.getBytes(charset);
        byte[] bytes2 = c6736b2.q().getBytes(charset);
        int min = Math.min(bytes.length, bytes2.length);
        for (int i8 = 0; i8 < min; i8++) {
            int compare = Integer.compare(bytes[i8] & 255, bytes2[i8] & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(bytes.length, bytes2.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        q5.AbstractC6635a.b("OG-CatDb", "Short read of " + r5 + " bytes, expected " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList f(android.content.Context r7) {
        /*
            java.lang.String r0 = "OG-CatDb"
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.io.IOException -> L44
            java.lang.String r1 = "category-db/categories.bin"
            r2 = 3
            java.io.InputStream r7 = r7.open(r1, r2)     // Catch: java.io.IOException -> L44
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L46
            r2 = 256(0x100, float:3.59E-43)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L46
        L16:
            int r3 = r7.read()     // Catch: java.lang.Throwable -> L46
            if (r3 >= 0) goto L1d
            goto L40
        L1d:
            r4 = 0
            int r5 = r7.read(r2, r4, r3)     // Catch: java.lang.Throwable -> L46
            if (r5 == r3) goto L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "Short read of "
            r2.append(r4)     // Catch: java.lang.Throwable -> L46
            r2.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = " bytes, expected "
            r2.append(r4)     // Catch: java.lang.Throwable -> L46
            r2.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L46
            q5.AbstractC6635a.b(r0, r2)     // Catch: java.lang.Throwable -> L46
        L40:
            r7.close()     // Catch: java.io.IOException -> L44
            return r1
        L44:
            r7 = move-exception
            goto L5e
        L46:
            r1 = move-exception
            goto L53
        L48:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L46
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L46
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L46
            r1.add(r3)     // Catch: java.lang.Throwable -> L46
            goto L16
        L53:
            if (r7 == 0) goto L5d
            r7.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r7 = move-exception
            r1.addSuppressed(r7)     // Catch: java.io.IOException -> L44
        L5d:
            throw r1     // Catch: java.io.IOException -> L44
        L5e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception reading category-db/categories.bin: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            q5.AbstractC6635a.b(r0, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.T.f(android.content.Context):java.util.ArrayList");
    }

    private static byte[] h(byte[] bArr) {
        LZ4SafeDecompressor safeDecompressor = LZ4Factory.fastestJavaInstance().safeDecompressor();
        int length = bArr.length * 2;
        do {
            try {
                return safeDecompressor.decompress(bArr, length);
            } catch (LZ4Exception e8) {
                AbstractC6635a.a("OG-CatDb", "Exception while decompressing " + bArr.length + " bytes with maxOutputLength=" + length + ": " + e8);
                length *= 2;
            }
        } while (length <= 1048576);
        AbstractC6635a.b("OG-CatDb", "Failed to decompress " + bArr.length + " bytes");
        return new byte[0];
    }

    private static void i(InputStream inputStream, long j8) {
        while (j8 > 0) {
            long skip = inputStream.skip(j8);
            if (skip == 0) {
                throw new IOException("unable to skip " + j8 + " bytes");
            }
            j8 -= skip;
        }
    }

    public U b(String str, Map map) {
        Locale locale = Locale.getDefault();
        String languageTag = locale.toLanguageTag();
        String m8 = AbstractC6803e.m(languageTag);
        String e8 = AbstractC6803e.e(str, locale);
        List<String> g8 = g(e8, languageTag);
        if (!m8.equals(languageTag)) {
            HashSet hashSet = new HashSet();
            Iterator it = g8.iterator();
            while (it.hasNext()) {
                hashSet.add(AbstractC6803e.d((String) it.next(), locale));
            }
            for (String str2 : g(e8, m8)) {
                if (!hashSet.contains(AbstractC6803e.d(str2, locale))) {
                    g8.add(str2);
                }
            }
        }
        ArrayList arrayList = new ArrayList(g8.size());
        for (String str3 : g8) {
            arrayList.add(new U.a(str3, c(str3, map, locale)));
        }
        Iterator it2 = arrayList.iterator();
        String str4 = null;
        while (it2.hasNext() && (str4 = ((U.a) it2.next()).a()) == null) {
        }
        return new U(str4, arrayList);
    }

    List g(String str, String str2) {
        String str3 = "category-db/suggest-" + str2 + ".bin";
        ArrayList arrayList = new ArrayList();
        try {
            DataInputStream dataInputStream = new DataInputStream(this.f34483a.getAssets().open(str3));
            try {
                byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
                dataInputStream.readFully(bArr);
                C6738d m8 = C6738d.m(bArr);
                int d8 = d(str, m8.j());
                int i8 = 0;
                for (int i9 = 0; i9 < d8; i9++) {
                    i8 += m8.i(i9);
                }
                i(dataInputStream, i8);
                byte[] bArr2 = new byte[m8.i(d8)];
                dataInputStream.readFully(bArr2);
                C6737c m9 = C6737c.m(h(bArr2));
                int binarySearch = Collections.binarySearch(m9.k(), C6736b.u().w(str).m(), f34482c);
                if (binarySearch < 0) {
                    dataInputStream.close();
                    return arrayList;
                }
                Iterator it = m9.i(binarySearch).o().iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue < 0 || intValue >= this.f34484b.size()) {
                        AbstractC6635a.b("OG-CatDb", "categoryIndex " + intValue + " out of bounds");
                    } else {
                        arrayList.add((String) this.f34484b.get(intValue));
                    }
                }
                dataInputStream.close();
                return arrayList;
            } finally {
            }
        } catch (IOException e8) {
            AbstractC6635a.b("OG-CatDb", "Exception reading " + str3 + ": " + e8);
            return arrayList;
        }
    }
}
