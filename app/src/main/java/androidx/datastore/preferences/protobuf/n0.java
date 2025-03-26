package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f9463a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i8) {
            if (m(b9) || (((b8 << 28) + (b9 + 112)) >> 30) != 0 || m(b10) || m(b11)) {
                throw InvalidProtocolBufferException.c();
            }
            int r8 = ((b8 & 7) << 18) | (r(b9) << 12) | (r(b10) << 6) | r(b11);
            cArr[i8] = l(r8);
            cArr[i8 + 1] = q(r8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b8, char[] cArr, int i8) {
            cArr[i8] = (char) b8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b8, byte b9, byte b10, char[] cArr, int i8) {
            if (m(b9) || ((b8 == -32 && b9 < -96) || ((b8 == -19 && b9 >= -96) || m(b10)))) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i8] = (char) (((b8 & 15) << 12) | (r(b9) << 6) | r(b10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b8, byte b9, char[] cArr, int i8) {
            if (b8 < -62 || m(b9)) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i8] = (char) (((b8 & 31) << 6) | r(b9));
        }

        private static char l(int i8) {
            return (char) ((i8 >>> 10) + 55232);
        }

        private static boolean m(byte b8) {
            return b8 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b8) {
            return b8 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b8) {
            return b8 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b8) {
            return b8 < -32;
        }

        private static char q(int i8) {
            return (char) ((i8 & 1023) + 56320);
        }

        private static int r(byte b8) {
            return b8 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i8, int i9);

        abstract int b(CharSequence charSequence, byte[] bArr, int i8, int i9);

        final boolean c(byte[] bArr, int i8, int i9) {
            return d(0, bArr, i8, i9) == 0;
        }

        abstract int d(int i8, byte[] bArr, int i9, int i10);
    }

    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i8, int i9) {
            while (i8 < i9 && bArr[i8] >= 0) {
                i8++;
            }
            if (i8 >= i9) {
                return 0;
            }
            return f(bArr, i8, i9);
        }

        private static int f(byte[] bArr, int i8, int i9) {
            while (i8 < i9) {
                int i10 = i8 + 1;
                byte b8 = bArr[i8];
                if (b8 < 0) {
                    if (b8 < -32) {
                        if (i10 >= i9) {
                            return b8;
                        }
                        if (b8 >= -62) {
                            i8 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b8 >= -16) {
                        if (i10 >= i9 - 2) {
                            return n0.l(bArr, i10, i9);
                        }
                        int i11 = i8 + 2;
                        byte b9 = bArr[i10];
                        if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                            int i12 = i8 + 3;
                            if (bArr[i11] <= -65) {
                                i8 += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 1) {
                        return n0.l(bArr, i10, i9);
                    }
                    int i13 = i8 + 2;
                    byte b10 = bArr[i10];
                    if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                        i8 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                i8 = i10;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.n0.b
        String a(byte[] bArr, int i8, int i9) {
            if ((i8 | i9 | ((bArr.length - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b8 = bArr[i8];
                if (!a.n(b8)) {
                    break;
                }
                i8++;
                a.i(b8, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b9 = bArr[i8];
                if (a.n(b9)) {
                    int i14 = i12 + 1;
                    a.i(b9, cArr, i12);
                    while (i13 < i10) {
                        byte b10 = bArr[i13];
                        if (!a.n(b10)) {
                            break;
                        }
                        i13++;
                        a.i(b10, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i13;
                } else if (a.p(b9)) {
                    if (i13 >= i10) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i8 += 2;
                    a.k(b9, bArr[i13], cArr, i12);
                    i12++;
                } else if (a.o(b9)) {
                    if (i13 >= i10 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i15 = i8 + 2;
                    i8 += 3;
                    a.j(b9, bArr[i13], bArr[i15], cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b11 = bArr[i13];
                    int i16 = i8 + 3;
                    byte b12 = bArr[i8 + 2];
                    i8 += 4;
                    a.h(b9, b11, b12, bArr[i16], cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.n0.b
        int b(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            int i10;
            int i11;
            char charAt;
            int length = charSequence.length();
            int i12 = i9 + i8;
            int i13 = 0;
            while (i13 < length && (i11 = i13 + i8) < i12 && (charAt = charSequence.charAt(i13)) < 128) {
                bArr[i11] = (byte) charAt;
                i13++;
            }
            if (i13 == length) {
                return i8 + length;
            }
            int i14 = i8 + i13;
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 < 128 && i14 < i12) {
                    bArr[i14] = (byte) charAt2;
                    i14++;
                } else if (charAt2 < 2048 && i14 <= i12 - 2) {
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                    i14 += 2;
                    bArr[i15] = (byte) ((charAt2 & '?') | 128);
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || i14 > i12 - 3) {
                        if (i14 > i12 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i14);
                        }
                        int i16 = i13 + 1;
                        if (i16 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i16);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i17 = i14 + 3;
                                bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                bArr[i17] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                    int i18 = i14 + 2;
                    bArr[i14 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i14 += 3;
                    bArr[i18] = (byte) ((charAt2 & '?') | 128);
                }
                i13++;
            }
            return i14;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.n0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.n0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.n0.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.n0.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.c.d(int, byte[], int, int):int");
        }
    }

    static class d extends IllegalArgumentException {
        d(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean e() {
            return m0.C() && m0.D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int f(byte[] r10, long r11, int r13) {
            /*
                int r0 = g(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.m0.s(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = androidx.datastore.preferences.protobuf.m0.s(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = h(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.m0.s(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = androidx.datastore.preferences.protobuf.m0.s(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = h(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.m0.s(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.m0.s(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.m0.s(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.e.f(byte[], long, int):int");
        }

        private static int g(byte[] bArr, long j8, int i8) {
            int i9 = 0;
            if (i8 < 16) {
                return 0;
            }
            while (i9 < i8) {
                long j9 = 1 + j8;
                if (m0.s(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j9;
            }
            return i8;
        }

        private static int h(byte[] bArr, int i8, long j8, int i9) {
            if (i9 == 0) {
                return n0.i(i8);
            }
            if (i9 == 1) {
                return n0.j(i8, m0.s(bArr, j8));
            }
            if (i9 == 2) {
                return n0.k(i8, m0.s(bArr, j8), m0.s(bArr, j8 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.n0.b
        String a(byte[] bArr, int i8, int i9) {
            if ((i8 | i9 | ((bArr.length - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte s8 = m0.s(bArr, i8);
                if (!a.n(s8)) {
                    break;
                }
                i8++;
                a.i(s8, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte s9 = m0.s(bArr, i8);
                if (a.n(s9)) {
                    int i14 = i12 + 1;
                    a.i(s9, cArr, i12);
                    while (i13 < i10) {
                        byte s10 = m0.s(bArr, i13);
                        if (!a.n(s10)) {
                            break;
                        }
                        i13++;
                        a.i(s10, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i13;
                } else if (a.p(s9)) {
                    if (i13 >= i10) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i8 += 2;
                    a.k(s9, m0.s(bArr, i13), cArr, i12);
                    i12++;
                } else if (a.o(s9)) {
                    if (i13 >= i10 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i15 = i8 + 2;
                    i8 += 3;
                    a.j(s9, m0.s(bArr, i13), m0.s(bArr, i15), cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte s11 = m0.s(bArr, i13);
                    int i16 = i8 + 3;
                    byte s12 = m0.s(bArr, i8 + 2);
                    i8 += 4;
                    a.h(s9, s11, s12, m0.s(bArr, i16), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.n0.b
        int b(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            long j8;
            String str;
            String str2;
            int i10;
            long j9;
            long j10;
            char charAt;
            long j11 = i8;
            long j12 = i9 + j11;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i9 || bArr.length - i9 < i8) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i8 + i9));
            }
            int i11 = 0;
            while (true) {
                j8 = 1;
                if (i11 >= length || (charAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                m0.H(bArr, j11, (byte) charAt);
                i11++;
                j11 = 1 + j11;
            }
            if (i11 == length) {
                return (int) j11;
            }
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                if (charAt2 >= 128 || j11 >= j12) {
                    if (charAt2 >= 2048 || j11 > j12 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j11 > j12 - 3) {
                            if (j11 > j12 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                                    throw new d(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j11);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char charAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j9 = 1;
                                    m0.H(bArr, j11, (byte) ((codePoint >>> 18) | 240));
                                    j10 = j12;
                                    m0.H(bArr, j11 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = j11 + 3;
                                    m0.H(bArr, j11 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j11 += 4;
                                    m0.H(bArr, j13, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new d(i11 - 1, length);
                        }
                        m0.H(bArr, j11, (byte) ((charAt2 >>> '\f') | 480));
                        long j14 = j11 + 2;
                        m0.H(bArr, j11 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j11 += 3;
                        m0.H(bArr, j14, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j15 = j11 + j8;
                        m0.H(bArr, j11, (byte) ((charAt2 >>> 6) | 960));
                        j11 += 2;
                        m0.H(bArr, j15, (byte) ((charAt2 & '?') | 128));
                    }
                    j10 = j12;
                    j9 = 1;
                } else {
                    m0.H(bArr, j11, (byte) charAt2);
                    j10 = j12;
                    str2 = str4;
                    j9 = j8;
                    j11 += j8;
                    str = str3;
                }
                i11++;
                str3 = str;
                str4 = str2;
                j8 = j9;
                j12 = j10;
            }
            return (int) j11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.m0.s(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.m0.s(r13, r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.n0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f9463a = (!e.e() || AbstractC0880d.c()) ? new c() : new e();
    }

    static String e(byte[] bArr, int i8, int i9) {
        return f9463a.a(bArr, i8, i9);
    }

    static int f(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        return f9463a.b(charSequence, bArr, i8, i9);
    }

    static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 < length) {
                char charAt = charSequence.charAt(i8);
                if (charAt >= 2048) {
                    i9 += h(charSequence, i8);
                    break;
                }
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                break;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
            } else {
                i9 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i8) < 65536) {
                        throw new d(i8, length);
                    }
                    i8++;
                }
            }
            i8++;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i8) {
        if (i8 > -12) {
            return -1;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i8, int i9) {
        byte b8 = bArr[i8 - 1];
        int i10 = i9 - i8;
        if (i10 == 0) {
            return i(b8);
        }
        if (i10 == 1) {
            return j(b8, bArr[i8]);
        }
        if (i10 == 2) {
            return k(b8, bArr[i8], bArr[i8 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return f9463a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i8, int i9) {
        return f9463a.c(bArr, i8, i9);
    }
}
