package TEST;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 3) {
            h[z] = new Hobbits();
            // 인덱스에 따른 이름 할당 수정
            if (z == 0) { // 수정: 0번째 인덱스에 bilbo 할당
                h[z].name = "bilbo";
            } else if (z == 1) { // 수정: 1번째 인덱스에 frodo 할당
                h[z].name = "frodo";
            } else if (z == 2) { // 수정: 2번째 인덱스에 sam 할당
                h[z].name = "sam";
            }
            z = z + 1; // 수정: 인덱스를 증가시키는 위치 변경
        }

        // 이름 출력
        for (int i = 0; i < h.length; i++) {
            System.out.print(h[i].name + " is a "); // 수정: "is a"와 "good Hobbit name" 사이에 공백 추가
            System.out.println("good Hobbit name");
        }
    }
}
