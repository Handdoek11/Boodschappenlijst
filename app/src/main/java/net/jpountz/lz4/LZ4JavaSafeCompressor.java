package net.jpountz.lz4;

/* loaded from: classes2.dex */
final class LZ4JavaSafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

    LZ4JavaSafeCompressor() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r17, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r11 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r10, 240);
        r12 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r20, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r10, r11 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r17, r9, r20, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        net.jpountz.util.SafeUtils.writeShortLE(r20, r12, (short) (r8 - r15));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r17, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (((r12 + 8) + (r11 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r8 = r8 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r11 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r10, net.jpountz.util.SafeUtils.readByte(r20, r10) | 15);
        r9 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r10, r11 | net.jpountz.util.SafeUtils.readByte(r20, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        r9 = r8 - 2;
        net.jpountz.util.SafeUtils.writeShort(r2, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.SafeUtils.readInt(r17, r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.SafeUtils.readInt(r17, r8));
        r15 = r1 + net.jpountz.util.SafeUtils.readShort(r2, r9);
        net.jpountz.util.SafeUtils.writeShort(r2, r9, r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r17, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r10, 0);
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r12 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r19, r15, r7, r1, r9);
        r7 = r7 - r12;
        r15 = r15 - r12;
        r12 = r7 - r9;
        r13 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if ((((r13 + r12) + 8) + (r12 >>> 8)) > r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r12 < 15) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r10, 240);
        r13 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r12 - 15, r22, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r10, r12 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r19, r9, r22, r13, r12);
        r13 = r13 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        net.jpountz.util.SafeUtils.writeShortLE(r22, r13, r11);
        r9 = r13 + 2;
        r7 = r7 + 4;
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r19, r15 + 4, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (((r13 + 8) + (r11 >>> 8)) > r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r7 = r7 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r11 < 15) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r10, net.jpountz.util.SafeUtils.readByte(r22, r10) | 15);
        r9 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r22, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r10, r11 | net.jpountz.util.SafeUtils.readByte(r22, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r7 <= r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        r9 = r7 - 2;
        net.jpountz.util.SafeUtils.writeInt(r8, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.SafeUtils.readInt(r19, r9)), r9);
        r9 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.SafeUtils.readInt(r19, r7));
        r15 = net.jpountz.util.SafeUtils.readInt(r8, r9);
        net.jpountz.util.SafeUtils.writeInt(r8, r9, r7);
        r11 = r7 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r11 >= 65536) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r19, r15, r7) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        r13 = r10 + 1;
        net.jpountz.util.SafeUtils.writeByte(r22, r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r17, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r11 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r10, 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r20, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r10, r11 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r17, r9, r20, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeShortLE(r20, r12, (short) (r8 - r15));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r17, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (((r12 + 8) + (r11 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r8 = r8 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r11 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r10, net.jpountz.util.ByteBufferUtils.readByte(r20, r10) | 15);
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r10, r11 | net.jpountz.util.ByteBufferUtils.readByte(r20, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        r9 = r8 - 2;
        net.jpountz.util.SafeUtils.writeShort(r2, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r8));
        r15 = r1 + net.jpountz.util.SafeUtils.readShort(r2, r9);
        net.jpountz.util.SafeUtils.writeShort(r2, r9, r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r17, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r10, 0);
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9);
        r6 = r6 - r14;
        r12 = r12 - r14;
        r14 = r6 - r9;
        r15 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r14 < 15) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, 240);
        r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14 - 15, r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r14 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14);
        r15 = r15 + r14;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeShortLE(r8, r15, r13);
        r9 = r15 + 2;
        r1 = r1 + 4;
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12 + 4, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e0, code lost:
    
        if (((r15 + 8) + (r12 >>> 8)) > r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        r1 = r1 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        if (r12 < 15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, net.jpountz.util.ByteBufferUtils.readByte(r8, r11) | 15);
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r12 - 15, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r12 | net.jpountz.util.ByteBufferUtils.readByte(r8, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (r1 <= r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0102, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        r9 = r1 - 2;
        net.jpountz.util.SafeUtils.writeInt(r7, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r5, r9)), r9);
        r9 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r5, r1));
        r12 = net.jpountz.util.SafeUtils.readInt(r7, r9);
        net.jpountz.util.SafeUtils.writeInt(r7, r9, r1);
        r9 = r1 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012d, code lost:
    
        if (r9 >= 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r1) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0136, code lost:
    
        r15 = r11 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, 0);
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014a, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compress(java.nio.ByteBuffer r19, int r20, int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
