package com.studysiba.service.messenger;

import com.studysiba.domain.messenger.MessageVO;

public interface MessengerService {

	// 닉네임 입력값 확인
	String checkNick(String id, String nick, String type);
	// 유저 프로필 사진 조회
	String getUserImage(String nick);
	// 메세지 전송
	String sendMessage(MessageVO messageVO);
	// 메세지 뷰
	String getMessage(String id, String nick);
	// 메신저 유저 정보 리스트 조회
	String getMessengerUserList(String id);
	// 메세지 삭제
	String deleteMessage(String id, String nick);
	// 친구 상태 확인
	String checkFriendStatus(String id, String nick);
	// 친구 신청
	String applyFriend(String id, String nick);
	// 친구 신청 거절
	String refuseFriend(int no, String id, String nick);
	// 친구 신청 수락
	String acceptFriend(int no, String id, String nick);
	// 메세지 카운터
	String messageCounter(String id);

}
